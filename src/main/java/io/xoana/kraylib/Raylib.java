package io.xoana.kraylib;

import io.xoana.kraylib.graphics.*;
import io.xoana.kraylib.math.*;
import com.sun.jna.*;

public interface Raylib extends Library {
	Raylib INSTANCE = RaylibLoader.load();
	/*
	TODO:
struct Wave;            // Wave type, defines audio wave data
struct Sound;           // Basic Sound source and buffer
struct Music;           // Music type (file streaming from memory)
struct AudioStream;     // Raw audio stream type
	 */

	// CORE:
	void InitWindow(int width, int height, String title);
	void CloseWindow();
	boolean IsWindowReady();
	boolean WindowShouldClose();  // Check if KEY_ESCAPE pressed or Close icon pressed
	boolean IsWindowMinimized();  // Check if window has been minimized (or lost focus)
	void ToggleFullscreen();  // Toggle fullscreen mode (only PLATFORM_DESKTOP)
	void SetWindowIcon(Image.ByValue image);  // Set icon for window (only PLATFORM_DESKTOP)
	void SetWindowTitle(String title);  // Set title for window (only PLATFORM_DESKTOP)
	void SetWindowPosition(int x, int y);                                   // Set window position on screen (only PLATFORM_DESKTOP)
	void SetWindowMonitor(int monitor);                                     // Set monitor for the current window (fullscreen mode)
	void SetWindowMinSize(int width, int height);                           // Set window minimum dimensions (for FLAG_WINDOW_RESIZABLE)
	void SetWindowSize(int width, int height);                              // Set window dimensions
	int GetScreenWidth();                                               // Get current screen width
	int GetScreenHeight();                                              // Get current screen height

	// Cursor-related functions
	void ShowCursor();                                                  // Shows cursor
	void HideCursor();                                                  // Hides cursor
	boolean IsCursorHidden();                                              // Check if cursor is not visible
	void EnableCursor();                                                // Enables cursor (unlock cursor)
	void DisableCursor();                                               // Disables cursor (lock cursor)

	// Drawing-related functions
	void ClearBackground(Color.ByValue color);                                      // Set background color (framebuffer clear color)
	void BeginDrawing();                                                // Setup canvas (framebuffer) to start drawing
	void EndDrawing();                                                  // End canvas drawing and swap buffers (double buffering)
	void BeginMode2D(Camera2D.ByValue camera);                                      // Initialize 2D mode with custom camera (2D)
	void EndMode2D();                                                   // Ends 2D mode with custom camera
	void BeginMode3D(Camera.ByValue camera);                                      // Initializes 3D mode with custom camera (3D)
	void EndMode3D();                                                   // Ends 3D mode and returns to default 2D orthographic mode
	void BeginTextureMode(RenderTexture2D.ByValue target);                          // Initializes render texture for drawing
	void EndTextureMode();                                              // Ends drawing to render texture


	// Screen-space-related functions
	Ray GetMouseRay(Vector2.ByValue mousePosition, Camera.ByValue camera);                  // Returns a ray trace from mouse position
	Vector2 GetWorldToScreen(Vector3.ByValue position, Camera.ByValue camera);              // Returns the screen space position for a 3d world space position
	Matrix GetCameraMatrix(Camera.ByValue camera);                                  // Returns camera transform matrix (view matrix)

	// Timing-related functions
	void SetTargetFPS(int fps);                                             // Set target FPS (maximum)
	int GetFPS();                                                       // Returns current FPS
	float GetFrameTime();                                               // Returns time in seconds for last frame drawn
	double GetTime();                                                   // Returns elapsed time in seconds since InitWindow()

	// Color-related functions
	int ColorToInt(Color.ByValue color);                                            // Returns hexadecimal value for a Color
	Vector4 ColorNormalize(Color.ByValue color);                                    // Returns color normalized as float [0..1]
	Vector3 ColorToHSV(Color.ByValue color);                                        // Returns HSV values for a Color
	Color GetColor(int hexValue);                                           // Returns a Color struct from hexadecimal value
	Color Fade(Color.ByValue color, float alpha);                                   // Color fade-in or fade-out, alpha goes from 0.0f to 1.0f

	// Misc. functions
	void ShowLogo();                                                    // Activate raylib logo at startup (can be done with flags)
	void SetConfigFlags(byte flags);                               // Setup window configuration flags (view FLAGS)
	void SetTraceLog(byte types);                                  // Enable trace log message types (bit flags based)
	void TraceLog(int logType, String... text);                      // Show trace log messages (LOG_INFO, LOG_WARNING, LOG_ERROR, LOG_DEBUG)
	void TakeScreenshot(String fileName);                              // Takes a screenshot of current screen (saved a .png)
	int GetRandomValue(int min, int max);                                   // Returns a random value between min and max (both included)

	// Files management functions
	boolean IsFileExtension(String fileName, String ext);            // Check file extension
    String GetExtension(String fileName);                         // Get pointer to extension for a filename string
    String GetFileName(String filePath);                          // Get pointer to filename for a path string
    String GetDirectoryPath(String fileName);                     // Get full path for a given fileName (uses static string)
    String GetWorkingDirectory();                                  // Get current working directory (uses static string)
	boolean ChangeDirectory(String dir);                                  // Change working directory, returns true if success
	boolean IsFileDropped();                                               // Check if a file has been dropped into window
	// char **GetDroppedFiles(int *count)
	Pointer GetDroppedFiles(int count);                                     // Get dropped files names
	void ClearDroppedFiles();                                           // Clear dropped files paths buffer

	// Persistent storage management
	void StorageSaveValue(int position, int value);                         // Save integer value to storage file (to defined position)
	int StorageLoadValue(int position);                                     // Load integer value from storage file (from defined position)

	// Input-related functions: keyboard
	boolean IsKeyPressed(int key);                                             // Detect if a key has been pressed once
	boolean IsKeyDown(int key);                                                // Detect if a key is being pressed
	boolean IsKeyReleased(int key);                                            // Detect if a key has been released once
	boolean IsKeyUp(int key);                                                  // Detect if a key is NOT being pressed
	int GetKeyPressed();                                                // Get latest key pressed
	void SetExitKey(int key);                                               // Set a custom key to exit program (default is ESC)
	
	// Input-related functions: gamepads
	boolean IsGamepadAvailable(int gamepad);                                   // Detect if a gamepad is available
	boolean IsGamepadName(int gamepad, String name);                      // Check gamepad name (if available)
    String GetGamepadName(int gamepad);                                // Return gamepad internal name id
	boolean IsGamepadButtonPressed(int gamepad, int button);                   // Detect if a gamepad button has been pressed once
	boolean IsGamepadButtonDown(int gamepad, int button);                      // Detect if a gamepad button is being pressed
	boolean IsGamepadButtonReleased(int gamepad, int button);                  // Detect if a gamepad button has been released once
	boolean IsGamepadButtonUp(int gamepad, int button);                        // Detect if a gamepad button is NOT being pressed
	int GetGamepadButtonPressed();                                      // Get the last gamepad button pressed
	int GetGamepadAxisCount(int gamepad);                                   // Return gamepad axis count for a gamepad
	float GetGamepadAxisMovement(int gamepad, int axis);                    // Return axis movement value for a gamepad axis

	// Input-related functions: mouse
	boolean IsMouseButtonPressed(int button);                                  // Detect if a mouse button has been pressed once
	boolean IsMouseButtonDown(int button);                                     // Detect if a mouse button is being pressed
	boolean IsMouseButtonReleased(int button);                                 // Detect if a mouse button has been released once
	boolean IsMouseButtonUp(int button);                                       // Detect if a mouse button is NOT being pressed
	int GetMouseX();                                                    // Returns mouse position X
	int GetMouseY();                                                    // Returns mouse position Y
	Vector2 GetMousePosition();                                         // Returns mouse position XY
	void SetMousePosition(Vector2.ByValue position);                                // Set mouse position XY
	int GetMouseWheelMove();                                            // Returns mouse wheel movement Y

	// Input-related functions: touch
	int GetTouchX();                                                    // Get touch position X for touch point 0 (relative to screen size)
	int GetTouchY();                                                    // Get touch position Y for touch point 0 (relative to screen size)
	Vector2 GetTouchPosition(int index);                                    // Get touch position XY for a touch point index (relative to screen size)

	// Gestures-related functions
	void SetGesturesEnabled(int gestureFlags);                     // Enable a set of gestures using flags
	boolean IsGestureDetected(int gesture);                                    // Check if a gesture have been detected
	int GetGestureDetected();                                           // Get latest detected gesture
	int GetTouchPointsCount();                                          // Get touch points count
	float GetGestureHoldDuration();                                     // Get gesture hold time in milliseconds
	Vector2 GetGestureDragVector();                                     // Get gesture drag vector
	float GetGestureDragAngle();                                        // Get gesture drag angle
	Vector2 GetGesturePinchVector();                                    // Get gesture pinch delta
	float GetGesturePinchAngle();                                       // Get gesture pinch angle

	// Camera-related functions
	void SetCameraMode(Camera.ByReference camera, int mode);                            // Set camera mode (multiple camera modes available)
	void UpdateCamera(Camera.ByReference camera);                                      // Update camera position for selected mode
	void SetCameraPanControl(int panKey);                                   // Set camera pan key to combine with mouse movement (free camera)
	void SetCameraAltControl(int altKey);                                   // Set camera alt key to combine with mouse movement (free camera)
	void SetCameraSmoothZoomControl(int szKey);                             // Set camera smooth zoom key to combine with mouse (free camera)
	void SetCameraMoveControls(int frontKey, int backKey,
							   int rightKey, int leftKey,
							   int upKey, int downKey);                     // Set camera move controls (1st person and 3rd person cameras)

	// SHAPES
	// Basic shapes drawing functions
	void DrawPixel(int posX, int posY, Color.ByValue color);                                                    // Draw a pixel
	void DrawPixelV(Vector2.ByValue position, Color.ByValue color);                                                     // Draw a pixel (Vector version)
	void DrawLine(int startPosX, int startPosY, int endPosX, int endPosY, Color.ByValue color);                 // Draw a line
	void DrawLineV(Vector2.ByValue startPos, Vector2.ByValue endPos, Color.ByValue color);                                      // Draw a line (Vector version)
	void DrawLineEx(Vector2.ByValue startPos, Vector2.ByValue endPos, float thick, Color.ByValue color);                        // Draw a line defining thickness
	void DrawLineBezier(Vector2.ByValue startPos, Vector2.ByValue endPos, float thick, Color.ByValue color);                    // Draw a line using cubic-bezier curves in-out
	void DrawCircle(int centerX, int centerY, float radius, Color.ByValue color);                               // Draw a color-filled circle
	void DrawCircleGradient(int centerX, int centerY, float radius, Color.ByValue color1, Color.ByValue color2);        // Draw a gradient-filled circle
	void DrawCircleV(Vector2.ByValue center, float radius, Color.ByValue color);                                        // Draw a color-filled circle (Vector version)
	void DrawCircleLines(int centerX, int centerY, float radius, Color.ByValue color);                          // Draw circle outline
	void DrawRectangle(int posX, int posY, int width, int height, Color.ByValue color);                         // Draw a color-filled rectangle
	void DrawRectangleV(Vector2.ByValue position, Vector2.ByValue size, Color.ByValue color);                                   // Draw a color-filled rectangle (Vector version)
	void DrawRectangleRec(Rectangle.ByValue rec, Color.ByValue color);                                                  // Draw a color-filled rectangle
	void DrawRectanglePro(Rectangle.ByValue rec, Vector2.ByValue origin, float rotation, Color.ByValue color);                  // Draw a color-filled rectangle with pro parameters
	void DrawRectangleGradientV(int posX, int posY, int width, int height, Color.ByValue color1, Color.ByValue color2); // Draw a vertical-gradient-filled rectangle
	void DrawRectangleGradientH(int posX, int posY, int width, int height, Color.ByValue color1, Color.ByValue color2); // Draw a horizontal-gradient-filled rectangle
	void DrawRectangleGradientEx(Rectangle.ByValue rec, Color.ByValue col1, Color.ByValue col2, Color.ByValue col3, Color.ByValue col4);        // Draw a gradient-filled rectangle with custom vertex colors
	void DrawRectangleLines(int posX, int posY, int width, int height, Color.ByValue color);                    // Draw rectangle outline
	void DrawRectangleLinesEx(Rectangle.ByValue rec, int lineThick, Color.ByValue color);                               // Draw rectangle outline with extended parameters
	void DrawTriangle(Vector2.ByValue v1, Vector2.ByValue v2, Vector2.ByValue v3, Color.ByValue color);                                 // Draw a color-filled triangle
	void DrawTriangleLines(Vector2.ByValue v1, Vector2.ByValue v2, Vector2.ByValue v3, Color.ByValue color);                            // Draw triangle outline
	void DrawPoly(Vector2.ByValue center, int sides, float radius, float rotation, Color.ByValue color);                // Draw a regular polygon (Vector version)
	//TODO: void DrawPolyEx(Vector2 *points, int numPoints, Color color);
	void DrawPolyEx(Pointer points, int numPoints, Color.ByValue color);                                       // Draw a closed polygon defined by points
	//TODO: void DrawPolyExLines(Vector2 *points, int numPoints, Color color);
	void DrawPolyExLines(Pointer points, int numPoints, Color.ByValue color);                                  // Draw polygon lines

	// Basic shapes collision detection functions
	boolean CheckCollisionRecs(Rectangle.ByValue rec1, Rectangle.ByValue rec2);                                            // Check collision between two rectangles
	boolean CheckCollisionCircles(Vector2.ByValue center1, float radius1, Vector2.ByValue center2, float radius2);         // Check collision between two circles
	boolean CheckCollisionCircleRec(Vector2.ByValue center, float radius, Rectangle.ByValue rec);                          // Check collision between circle and rectangle
	Rectangle GetCollisionRec(Rectangle.ByValue rec1, Rectangle.ByValue rec2);                                          // Get collision rectangle for two rectangles collision
	boolean CheckCollisionPointRec(Vector2.ByValue point, Rectangle.ByValue rec);                                          // Check if point is inside rectangle
	boolean CheckCollisionPointCircle(Vector2.ByValue point, Vector2.ByValue center, float radius);                        // Check if point is inside circle
	boolean CheckCollisionPointTriangle(Vector2.ByValue point, Vector2.ByValue p1, Vector2.ByValue p2, Vector2.ByValue p3);                // Check if point is inside a triangle

	// TEXTURE
	// Image/Texture2D data loading/unloading/saving functions
	Image LoadImage(String fileName);  // Load image from file into CPU memory (RAM)
	// Color*
	Image LoadImageEx(Pointer pixels, int width, int height);  // Load image from Color array data (RGBA - 32bit)
	// void*
	Image LoadImagePro(Pointer data, int width, int height, int format);  // Load image from raw data with parameters
	Image LoadImageRaw(String fileName, int width, int height, int format, int headerSize);        // Load image from RAW file data
	void ExportImage(String fileName, Image image);                                                // Export image as a PNG file
	Texture2D LoadTexture(String fileName);                                                        // Load texture from file into GPU memory (VRAM)
	Texture2D LoadTextureFromImage(Image.ByValue image);                                                        // Load texture from image data
	RenderTexture2D LoadRenderTexture(int width, int height);                                           // Load texture for rendering (framebuffer)
	void UnloadImage(Image.ByReference image);                                                                      // Unload image from CPU memory (RAM)
	void UnloadTexture(Texture2D.ByReference texture);                                                              // Unload texture from GPU memory (VRAM)
	void UnloadRenderTexture(RenderTexture2D.ByReference target);                                                   // Unload render texture from GPU memory (VRAM)
	// Color*
	Pointer GetImageData(Image.ByValue image);                                                                   // Get pixel data from image as a Color struct array
	// Vector4*
	Pointer GetImageDataNormalized(Image.ByValue image);                                                       // Get pixel data from image as Vector4 array (float normalized)
	int GetPixelDataSize(int width, int height, int format);                                            // Get pixel data size in bytes (image or texture)
	Image GetTextureData(Texture2D.ByValue texture);                                                            // Get pixel data from GPU texture and return an Image
	// TODO: Not sure if this is by value or reference.
	void UpdateTexture(Texture2D.ByValue texture, Pointer pixels);                                          // Update GPU texture with new data

	// Image manipulation functions
	Image ImageCopy(Image.ByValue image);                                                                       // Create an image duplicate (useful for transformations)
	void ImageToPOT(Image.ByValue image, Color.ByValue fillColor);                                                     // Convert image to POT (power-of-two)
	void ImageFormat(Image.ByValue image, int newFormat);                                                      // Convert image data to desired format
	void ImageAlphaMask(Image.ByValue image, Image.ByValue alphaMask);                                                 // Apply alpha mask to image
	void ImageAlphaClear(Image.ByValue image, Color.ByValue color, float threshold);                                   // Clear alpha channel to desired color
	void ImageAlphaCrop(Image.ByValue image, float threshold);                                                 // Crop image depending on alpha value
	void ImageAlphaPremultiply(Image.ByValue image);                                                           // Premultiply alpha channel
	void ImageCrop(Image.ByValue image, Rectangle.ByValue crop);                                                       // Crop an image to a defined rectangle
	void ImageResize(Image.ByValue image, int newWidth, int newHeight);                                        // Resize image (bilinear filtering)
	void ImageResizeNN(Image.ByValue image, int newWidth, int newHeight);                                       // Resize image (Nearest-Neighbor scaling algorithm)
	void ImageResizeCanvas(Image.ByValue image, int newWidth, int newHeight,
						   int offsetX, int offsetY, Color.ByValue color);                                      // Resize canvas and fill with color
	void ImageMipmaps(Image.ByValue image);                                                                    // Generate all mipmap levels for a provided image
	void ImageDither(Image.ByValue image, int rBpp, int gBpp, int bBpp, int aBpp);                             // Dither image data to 16bpp or lower (Floyd-Steinberg dithering)
	Image ImageText(String text, int fontSize, Color.ByValue color);                                       // Create an image from text (default font)
	Image ImageTextEx(Font.ByValue font, String text, float fontSize, float spacing, Color.ByValue tint);          // Create an image from text (custom sprite font)
	void ImageDraw(Image.ByValue dst, Image.ByValue src, Rectangle.ByValue srcRec, Rectangle.ByValue dstRec);                          // Draw a source image within a destination image
	void ImageDrawRectangle(Image.ByValue dst, Vector2.ByValue position, Rectangle.ByValue rec, Color.ByValue color);                  // Draw rectangle within an image
	void ImageDrawText(Image.ByValue dst, Vector2.ByValue position, String text, int fontSize, Color.ByValue color);      // Draw text (default font) within an image (destination)
	void ImageDrawTextEx(Image.ByValue dst, Vector2.ByValue position, Font.ByValue font, String text,
						 float fontSize, float spacing, Color.ByValue color);                                   // Draw text (custom sprite font) within an image (destination)
	void ImageFlipVertical(Image.ByValue image);                                                               // Flip image vertically
	void ImageFlipHorizontal(Image.ByValue image);                                                             // Flip image horizontally
	void ImageRotateCW(Image.ByValue image);                                                                   // Rotate image clockwise 90deg
	void ImageRotateCCW(Image.ByValue image);                                                                  // Rotate image counter-clockwise 90deg
	void ImageColorTint(Image.ByValue image, Color.ByValue color);                                                     // Modify image color: tint
	void ImageColorInvert(Image.ByValue image);                                                                // Modify image color: invert
	void ImageColorGrayscale(Image.ByValue image);                                                             // Modify image color: grayscale
	void ImageColorContrast(Image.ByValue image, float contrast);                                              // Modify image color: contrast (-100 to 100)
	void ImageColorBrightness(Image.ByValue image, int brightness);                                            // Modify image color: brightness (-255 to 255)
	void ImageColorReplace(Image.ByValue image, Color.ByValue color, Color.ByValue replace);                                   // Modify image color: replace color

	// Image generation functions
	Image GenImageColor(int width, int height, Color.ByValue color);                                            // Generate image: plain color
	Image GenImageGradientV(int width, int height, Color.ByValue top, Color.ByValue bottom);                            // Generate image: vertical gradient
	Image GenImageGradientH(int width, int height, Color.ByValue left, Color.ByValue right);                            // Generate image: horizontal gradient
	Image GenImageGradientRadial(int width, int height, float density, Color.ByValue inner, Color.ByValue outer);       // Generate image: radial gradient
	Image GenImageChecked(int width, int height, int checksX, int checksY, Color.ByValue col1, Color.ByValue col2);     // Generate image: checked
	Image GenImageWhiteNoise(int width, int height, float factor);                                      // Generate image: white noise
	Image GenImagePerlinNoise(int width, int height, int offsetX, int offsetY, float scale);            // Generate image: perlin noise
	Image GenImageCellular(int width, int height, int tileSize);                                        // Generate image: cellular algorithm. Bigger tileSize means bigger cells

	// Texture2D configuration functions
	void GenTextureMipmaps(Texture2D.ByReference texture);                                                         // Generate GPU mipmaps for a texture
	void SetTextureFilter(Texture2D.ByReference texture, int filterMode);                                           // Set texture scaling filter mode
	void SetTextureWrap(Texture2D.ByReference texture, int wrapMode);                                               // Set texture wrapping mode

	// Texture2D drawing functions
	void DrawTexture(Texture2D.ByValue texture, int posX, int posY, Color.ByValue tint);  // Draw a Texture2D
	void DrawTextureV(Texture2D.ByValue texture, Vector2.ByValue position, Color.ByValue tint);  // Draw a Texture2D with position defined as Vector2
	void DrawTextureEx(Texture2D.ByValue texture, Vector2.ByValue position, float rotation, float scale, Color.ByValue tint);  // Draw a Texture2D with extended parameters
	void DrawTextureRec(Texture2D.ByValue texture, Rectangle.ByValue sourceRec, Vector2.ByValue position, Color.ByValue tint);  // Draw a part of a texture defined by a rectangle
	void DrawTexturePro(Texture2D.ByValue texture, Rectangle.ByValue sourceRec, Rectangle.ByValue destRec, Vector2.ByValue origin, float rotation, Color.ByValue tint);  // Draw a part of a texture defined by a rectangle with 'pro' parameters

	// TEXT
	// Font loading/unloading functions
	Font GetFontDefault();                                                                        // Get the default Font
	Font LoadFont(String fileName);                                                              // Load font from file into GPU memory (VRAM)
	Font LoadFontEx(String fileName, int fontSize, int charsCount, int[] fontChars);              // Load font from file with extended parameters
	//CharInfo *LoadFontData(String fileName, int fontSize, int *fontChars, int charsCount, boolean sdf); // Load font data for further use
	Image GenImageFontAtlas(Pointer chars, int fontSize, int charsCount, int padding, int packMethod);  // Generate image font atlas using chars info
	void UnloadFont(Font.ByReference font);                                                                       // Unload Font from GPU memory (VRAM)

	// Text drawing functions
	void DrawFPS(int posX, int posY);                                                                 // Shows current FPS
	void DrawText(String text, int posX, int posY, int fontSize, Color.ByValue color);                   // Draw text (using default font)
	void DrawTextEx(Font.ByValue font, String text, Vector2.ByValue position, float fontSize, float spacing, Color.ByValue tint); // Draw text using font and additional parameters

	// Text misc. functions
	int MeasureText(String text, int fontSize);                                                  // Measure string width for default font
	Vector2 MeasureTextEx(Font.ByValue font, String text, float fontSize, float spacing);                // Measure string size for Font
    String FormatText(String... text);                                                    // Formatting of text with variables to 'embed'
    String SubText(String text, int position, int length);                                  // Get a piece of a text string
	int GetGlyphIndex(Font.ByValue font, int character);                                                      // Get index position for a unicode character on font

	// MODELS
	// Basic geometric 3D shapes drawing functions
	void DrawLine3D(Vector3.ByValue startPos, Vector3.ByValue endPos, Color.ByValue color);                                     // Draw a line in 3D world space
	void DrawCircle3D(Vector3.ByValue center, float radius, Vector3.ByValue rotationAxis,
					  float rotationAngle, Color.ByValue color);                                                // Draw a circle in 3D world space
	void DrawCube(Vector3.ByValue position, float width, float height, float length, Color.ByValue color);              // Draw cube
	void DrawCubeV(Vector3.ByValue position, Vector3.ByValue size, Color.ByValue color);                                        // Draw cube (Vector version)
	void DrawCubeWires(Vector3.ByValue position, float width, float height, float length, Color.ByValue color);         // Draw cube wires
	void DrawCubeTexture(Texture2D.ByValue texture, Vector3 position, float width,
						 float height, float length, Color.ByValue color);                                      // Draw cube textured
	void DrawSphere(Vector3.ByValue centerPos, float radius, Color.ByValue color);                                      // Draw sphere
	void DrawSphereEx(Vector3.ByValue centerPos, float radius, int rings, int slices, Color.ByValue color);             // Draw sphere with extended parameters
	void DrawSphereWires(Vector3.ByValue centerPos, float radius, int rings, int slices, Color.ByValue color);          // Draw sphere wires
	void DrawCylinder(Vector3.ByValue position, float radiusTop, float radiusBottom,
					  float height, int slices, Color.ByValue color);                                           // Draw a cylinder/cone
	void DrawCylinderWires(Vector3.ByValue position, float radiusTop, float radiusBottom,
						   float height, int slices, Color.ByValue color);                                      // Draw a cylinder/cone wires
	void DrawPlane(Vector3.ByValue centerPos, Vector2.ByValue size, Color.ByValue color);                                       // Draw a plane XZ
	void DrawRay(Ray.ByValue ray, Color.ByValue color);                                                                 // Draw a ray line
	void DrawGrid(int slices, float spacing);                                                           // Draw a grid (centered at (0, 0, 0))
	void DrawGizmo(Vector3.ByValue position);                                                                   // Draw simple gizmo

	// Model loading/unloading functions
	Model LoadModel(String fileName);                                                              // Load model from files (mesh and material)
	Model LoadModelFromMesh(Mesh.ByValue mesh);                                                                 // Load model from generated mesh
	void UnloadModel(Model.ByValue model);                                                                      // Unload model from memory (RAM and/or VRAM)

	// Mesh loading/unloading functions
	Mesh LoadMesh(String fileName);                                                                // Load mesh from file
	void UnloadMesh(Mesh.ByReference mesh);                                                                        // Unload mesh from memory (RAM and/or VRAM)
	void ExportMesh(String fileName, Mesh.ByValue mesh);                                                   // Export mesh as an OBJ file

	// Mesh manipulation functions
	BoundingBox MeshBoundingBox(Mesh.ByValue mesh);                                                             // Compute mesh bounding box limits
	void MeshTangents(Mesh.ByReference mesh);                                                                      // Compute mesh tangents
	void MeshBinormals(Mesh.ByReference mesh);                                                                     // Compute mesh binormals

	// Mesh generation functions
	Mesh GenMeshPlane(float width, float length, int resX, int resZ);                                   // Generate plane mesh (with subdivisions)
	Mesh GenMeshCube(float width, float height, float length);                                          // Generate cuboid mesh
	Mesh GenMeshSphere(float radius, int rings, int slices);                                            // Generate sphere mesh (standard sphere)
	Mesh GenMeshHemiSphere(float radius, int rings, int slices);                                        // Generate half-sphere mesh (no bottom cap)
	Mesh GenMeshCylinder(float radius, float height, int slices);                                       // Generate cylinder mesh
	Mesh GenMeshTorus(float radius, float size, int radSeg, int sides);                                 // Generate torus mesh
	Mesh GenMeshKnot(float radius, float size, int radSeg, int sides);                                  // Generate trefoil knot mesh
	Mesh GenMeshHeightmap(Image.ByValue heightmap, Vector3.ByValue size);                                               // Generate heightmap mesh from image data
	Mesh GenMeshCubicmap(Image.ByValue cubicmap, Vector3.ByValue cubeSize);                                             // Generate cubes-based map mesh from image data

	// Material loading/unloading functions
	Material LoadMaterial(String fileName);                                                        // Load material from file
	Material LoadMaterialDefault();                                                                 // Load default material (Supports: DIFFUSE, SPECULAR, NORMAL maps)
	void UnloadMaterial(Material.ByValue material);                                                             // Unload material from GPU memory (VRAM)

	// Model drawing functions
	void DrawModel(Model.ByValue model, Vector3.ByValue position, float scale, Color.ByValue tint);                             // Draw a model (with texture if set)
	void DrawModelEx(Model.ByValue model, Vector3.ByValue position, Vector3.ByValue rotationAxis,
					 float rotationAngle, Vector3.ByValue scale, Color.ByValue tint);                                   // Draw a model with extended parameters
	void DrawModelWires(Model.ByValue model, Vector3.ByValue position, float scale, Color.ByValue tint);                        // Draw a model wires (with texture if set)
	void DrawModelWiresEx(Model.ByValue model, Vector3.ByValue position, Vector3.ByValue rotationAxis,
						  float rotationAngle, Vector3.ByValue scale, Color.ByValue tint);                              // Draw a model wires
	void DrawBoundingBox(BoundingBox.ByValue box, Color.ByValue color);                                                 // Draw bounding box (wires)
	void DrawBillboard(Camera.ByValue camera, Texture2D.ByValue texture, Vector3.ByValue center, float size, Color.ByValue tint);       // Draw a billboard texture
	void DrawBillboardRec(Camera.ByValue camera, Texture2D.ByValue texture, Rectangle.ByValue sourceRec,
						  Vector3.ByValue center, float size, Color.ByValue tint);                                      // Draw a billboard texture defined by sourceRec

	// Collision detection functions
	boolean CheckCollisionSpheres(Vector3.ByValue centerA, float radiusA, Vector3.ByValue centerB, float radiusB);                     // Detect collision between two spheres
	boolean CheckCollisionBoxes(Vector3.ByValue minBBox1, Vector3.ByValue maxBBox1, Vector3.ByValue minBBox2, Vector3.ByValue maxBBox2);               // Detect collision between two boxes
	boolean CheckCollisionBoxSphere(Vector3.ByValue minBBox, Vector3.ByValue maxBBox, Vector3.ByValue centerSphere, float radiusSphere);       // Detect collision between box and sphere
	boolean CheckCollisionRaySphere(Ray.ByValue ray, Vector3.ByValue spherePosition, float sphereRadius);                              // Detect collision between ray and sphere
	boolean CheckCollisionRaySphereEx(Ray.ByValue ray, Vector3.ByValue spherePosition, float sphereRadius, Vector3.ByReference collisionPoint);   // Detect collision between ray and sphere ex.
	boolean CheckCollisionRayBox(Ray.ByValue ray, Vector3.ByValue minBBox, Vector3.ByValue maxBBox);                                           // Detect collision between ray and box
	RayHitInfo GetCollisionRayModel(Ray.ByValue ray, Model.ByReference model);                                             // Get collision info between ray and model
	RayHitInfo GetCollisionRayTriangle(Ray.ByValue ray, Vector3.ByValue p1, Vector3.ByValue p2, Vector3.ByValue p3);                    // Get collision info between ray and triangle
	RayHitInfo GetCollisionRayGround(Ray.ByValue ray, float groundHeight);                                      // Get collision info between ray and ground plane (Y-normal plane)

	// SHADERS
	// Shader loading/unloading functions
	String LoadText(String fileName);                                                               // Load chars array from text file
	Shader LoadShader(String vsFileName, String fsFileName);                                              // Load a custom shader and bind default locations
	Shader LoadShaderCode(String vsCode, String fsCode);                                                  // Load shader from code strings and bind default locations
	void UnloadShader(Shader shader);                                                                   // Unload a custom shader from memory

	Shader GetShaderDefault();                                                                      // Get default shader
	Texture2D GetTextureDefault();                                                                  // Get default texture

	// Shader access functions
	int GetShaderLocation(Shader shader, String uniformName);                                      // Get shader uniform location
	void SetShaderValue(Shader shader, int uniformLoc, float[] value, int size);                         // Set shader uniform value (float)
	void SetShaderValuei(Shader shader, int uniformLoc, int[] value, int size);                          // Set shader uniform value (int)
	void SetShaderValueMatrix(Shader shader, int uniformLoc, Matrix mat);                               // Set shader uniform value (matrix 4x4)
	void SetMatrixProjection(Matrix proj);                                                              // Set a custom projection matrix (replaces internal projection matrix)
	void SetMatrixModelview(Matrix view);                                                               // Set a custom modelview matrix (replaces internal modelview matrix)
	Matrix GetMatrixModelview();                                                                        // Get internal modelview matrix

	// Shading beegin/end functions
	void BeginShaderMode(Shader shader);                                                                // Begin custom shader drawing
	void EndShaderMode();                                                                           // End custom shader drawing (use default shader)
	void BeginBlendMode(int mode);                                                                      // Begin blending mode (alpha, additive, multiplied)
	void EndBlendMode();                                                                            // End blending mode (reset to default: alpha blending)

	// VR control functions
	VrDeviceInfo GetVrDeviceInfo(int vrDeviceType);                                                     // Get VR device information for some standard devices
	void InitVrSimulator(VrDeviceInfo info);                                                            // Init VR simulator for selected device parameters
	void CloseVrSimulator();                                                                        // Close VR simulator for current device
	boolean IsVrSimulatorReady();                                                                      // Detect if VR simulator is ready
	void UpdateVrTracking(Camera.ByReference camera);                                                              // Update VR tracking (position and orientation) and camera
	void ToggleVrMode();                                                                            // Enable/Disable VR experience
	void BeginVrDrawing();                                                                          // Begin VR simulator stereo rendering
	void EndVrDrawing();                                                                            // End VR simulator stereo rendering
/*
	// AUDIO
	// Audio device management functions
	void InitAudioDevice(void);                                                     // Initialize audio device and context
	void CloseAudioDevice(void);                                                    // Close the audio device and context (and music stream)
	boolean IsAudioDeviceReady(void);                                                  // Check if audio device is ready
	void SetMasterVolume(float volume);                                             // Set master volume (listener)

	// Wave/Sound loading/unloading functions
	Wave LoadWave(String fileName);                                            // Load wave data from file into RAM
	Wave LoadWaveEx(float *data, int sampleCount, int sampleRate,
					int sampleSize, int channels);                                  // Load wave data from float array data (32bit)
	Sound LoadSound(String fileName);                                          // Load sound to memory
	Sound LoadSoundFromWave(Wave wave);                                             // Load sound to memory from wave data
	void UpdateSound(Sound sound, void *data, int numSamples);                      // Update sound buffer with new data
	void UnloadWave(Wave wave);                                                     // Unload wave data
	void UnloadSound(Sound sound);                                                  // Unload sound

	// Wave/Sound management functions
	void PlaySound(Sound sound);                                                    // Play a sound
	void PauseSound(Sound sound);                                                   // Pause a sound
	void ResumeSound(Sound sound);                                                  // Resume a paused sound
	void StopSound(Sound sound);                                                    // Stop playing a sound
	boolean IsSoundPlaying(Sound sound);                                               // Check if a sound is currently playing
	void SetSoundVolume(Sound sound, float volume);                                 // Set volume for a sound (1.0 is max level)
	void SetSoundPitch(Sound sound, float pitch);                                   // Set pitch for a sound (1.0 is base level)
	void WaveFormat(Wave *wave, int sampleRate, int sampleSize, int channels);      // Convert wave data to desired format
	Wave WaveCopy(Wave wave);                                                       // Copy a wave to a new wave
	void WaveCrop(Wave *wave, int initSample, int finalSample);                     // Crop a wave to defined samples range
	float *GetWaveData(Wave wave);                                                  // Get samples data from wave as a floats array

	// Music management functions
	Music LoadMusicStream(String fileName);                                    // Load music stream from file
	void UnloadMusicStream(Music music);                                            // Unload music stream
	void PlayMusicStream(Music music);                                              // Start music playing
	void UpdateMusicStream(Music music);                                            // Updates buffers for music streaming
	void StopMusicStream(Music music);                                              // Stop music playing
	void PauseMusicStream(Music music);                                             // Pause music playing
	void ResumeMusicStream(Music music);                                            // Resume playing paused music
	boolean IsMusicPlaying(Music music);                                               // Check if music is playing
	void SetMusicVolume(Music music, float volume);                                 // Set volume for music (1.0 is max level)
	void SetMusicPitch(Music music, float pitch);                                   // Set pitch for a music (1.0 is base level)
	void SetMusicLoopCount(Music music, float count);                               // Set music loop count (loop repeats)
	float GetMusicTimeLength(Music music);                                          // Get music time length (in seconds)
	float GetMusicTimePlayed(Music music);                                          // Get current music time played (in seconds)

	// AudioStream management functions
	AudioStream InitAudioStream(int sampleRate, int sampleSize,
								int channels);                             // Init audio stream (to stream raw audio pcm data)
	void UpdateAudioStream(AudioStream stream, void *data, int numSamples);         // Update audio stream buffers with data
	void CloseAudioStream(AudioStream stream);                                      // Close audio stream and free memory
	boolean IsAudioBufferProcessed(AudioStream stream);                                // Check if any audio stream buffers requires refill
	void PlayAudioStream(AudioStream stream);                                       // Play audio stream
	void PauseAudioStream(AudioStream stream);                                      // Pause audio stream
	void ResumeAudioStream(AudioStream stream);                                     // Resume audio stream
	void StopAudioStream(AudioStream stream);                                       // Stop audio stream
	*/

	/*
	struct Wave;            // Wave type, defines audio wave data
	struct Sound;           // Basic Sound source and buffer
	struct Music;           // Music type (file streaming from memory)
	struct AudioStream;     // Raw audio stream type
	*/
}
