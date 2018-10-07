package io.xoana.kraylib.graphics;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class VrDeviceInfo extends Structure implements Structure.ByReference, Structure.ByValue {
	int hResolution;                // HMD horizontal resolution in pixels
	int vResolution;                // HMD vertical resolution in pixels
	float hScreenSize;              // HMD horizontal size in meters
	float vScreenSize;              // HMD vertical size in meters
	float vScreenCenter;            // HMD screen center in meters
	float eyeToScreenDistance;      // HMD distance between eye and display in meters
	float lensSeparationDistance;   // HMD lens separation distance in meters
	float interpupillaryDistance;   // HMD IPD (distance between pupils) in meters
	float lensDistortionValues0;  // HMD lens distortion constant parameters
	float lensDistortionValues1;
	float lensDistortionValues2;
	float lensDistortionValues3;
	float chromaAbCorrection0;    // HMD chromatic aberration correction parameters
	float chromaAbCorrection1;
	float chromaAbCorrection2;
	float chromaAbCorrection3;

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList(
				"hResolution",
				"vResolution",
				"hScreenSize",
				"vScreenSize",
				"vScreenCenter",
				"eyeToScreenDistance",
				"lensSeparationDistance",
				"interpupillaryDistance",
				"lensDistortionValues0",
				"lensDistortionValues1",
				"lensDistortionValues2",
				"lensDistortionValues3",
				"chromaAbCorrection0",
				"chromaAbCorrection1",
				"chromaAbCorrection2",
				"chromaAbCorrection3"
		);
	}
}
