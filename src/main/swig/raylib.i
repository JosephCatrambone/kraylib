/* File : raylib.i */
/* 
	Run with `swig.exe -java -module Raylib -package "io.xoana.kraylib" raylib.h`
	// Manually edit raylib_wrap.c to #include raylib.h.
	gcc -c -fpic raylib_wrap.c -I"C:\Program Files\Java\jdk1.8.0_161\include" -I"C:\Program Files\Java\jdk1.8.0_161\include\win32"
	ld -G raylib_wrap.o -o raylib.dll -L. -lraylib -lglfw3 -lopengl32 -lgdi32
*/

%module Raylib
%{
#include "raylib.h"
%}

%include "raylib.h"