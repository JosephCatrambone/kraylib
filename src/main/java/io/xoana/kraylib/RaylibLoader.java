package io.xoana.kraylib;

import jnr.ffi.LibraryLoader;

import java.io.*;

public class RaylibLoader {

	/**
	 * Copies raylib for the current target to a temporary store and invokes the library loader.
	 * @return
	 */
	public static Raylib load() throws IOException {
		// Pick the correct resource for our system.
		String nativeLibrary = "/raylib-2.0.0-Win64-mingw/lib/libraylib_shared.dll"; // TODO
		String nativeLibraryExtension = ".dll";
		String nativeLibraryPrefix = ""; // Linux has "lib" prefix.

		// Copy the correct system-native version of raylib to a temp folder.
		InputStream fin = RaylibLoader.class.getResourceAsStream(nativeLibrary);
		if(fin == null) {
			System.err.println("Failed to locate system native file in resources.");
			throw new IOException();
		}
		byte[] buffer = new byte[4096]; // Most new disks have 4096-byte chunks in the FS.
		File temp = File.createTempFile(nativeLibraryPrefix + "raylib", nativeLibraryExtension);
		FileOutputStream fout = new FileOutputStream(temp);
		int bytesRead = -1;
		while((bytesRead = fin.read(buffer)) != -1) {
			fout.write(buffer);
		}
		fout.close();
		fin.close();

		// temp.getPath now has the full path to the library.  Remove filename.
		String loadPath = temp.getPath();
		loadPath = loadPath.substring(0, loadPath.lastIndexOf(File.separatorChar));
		// Need to remove the .dll or .so and, maybe, get rid of "lib" at the start.
		// We need to remove the filename from the full path and remove the ".dll" suffix from the filename.
		// Note that we can't remove the ".dll" from the suffix above or the library won't be found by LibLoader.
		// It expects just "foo" when trying to load "libfoo" or "foo.dll".
		// In being smart it has made our lives hard.
		String loadName = temp.getName();
		loadName = loadName.replaceFirst(nativeLibraryPrefix, "");
		loadName = loadName.substring(0, loadName.length()-nativeLibraryExtension.length());

		// Invoke loader.
		System.out.println("Trying to load raylib from " + loadPath + " with name " + loadName);
		Raylib raylib = LibraryLoader.create(Raylib.class).search(loadPath).load(loadName);
		return raylib;
	}
}
