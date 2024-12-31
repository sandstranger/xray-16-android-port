cmake_minimum_required(VERSION 3.22.1)
project(xray-16)

set (USE_LTO OFF)
set(XRAY_USE_LUAJIT OFF)
set(CMAKE_UNITY_BUILD ON)
set(PCH_WARN_INVALID OFF)

set(LUA_LOCATION ${CMAKE_SOURCE_DIR}/lua)
set(LUA_INCLUDE_DIR ${LUA_LOCATION}/src/main/LuaJIT_CMAKE/src)
set(LUA_LIBRARIES ${LUA_LOCATION}/build/intermediates/merged_native_libs/release/mergeReleaseNativeLibs/out/lib/${ANDROID_ABI}/libluajit.so)

set(SDL_LOCATION ${CMAKE_SOURCE_DIR}/sdl2)
set(SDL2_INCLUDE_DIRS ${SDL_LOCATION}/include)

if (CMAKE_BUILD_TYPE EQUAL "DEBUG")
    set(SDL2_LIBRARIES ${SDL_LOCATION}/android-project/app/build/intermediates/merged_native_libs/debug/mergeDebugNativeLibs/out/lib/${ANDROID_ABI}/libSDL2.so)
else()
    set(SDL2_LIBRARIES ${SDL_LOCATION}/android-project/app/build/intermediates/merged_native_libs/release/mergeReleaseNativeLibs/out/lib/${ANDROID_ABI}/libSDL2.so)
endif ()

set(OPENAL_LOCATION ${CMAKE_SOURCE_DIR}/libopenal)
set(OPENAL_INCLUDE_DIR ${OPENAL_LOCATION}/src/main/jni/openal-soft/include/AL)
set(OPENAL_EFX_INCLUDE_DIR ${OPENAL_LOCATION}/src/main/jni/openal-soft/include/AL)
if (CMAKE_BUILD_TYPE EQUAL "DEBUG")
    set(OPENAL_LIBRARY ${OPENAL_LOCATION}/build/intermediates/merged_native_libs/debug/mergeDebugNativeLibs/out/lib/${ANDROID_ABI}/libopenal.so)
else ()
    set(OPENAL_LIBRARY ${OPENAL_LOCATION}/build/intermediates/merged_native_libs/release/mergeReleaseNativeLibs/out/lib/${ANDROID_ABI}/libopenal.so)
endif ()

set(OGG_LOCATION ${CMAKE_SOURCE_DIR}/libvorbis)
set(OGG_INCLUDE_DIR ${OGG_LOCATION}/src/main/libvorbis-android/jni/include)
set(OGG_LIBRARY ${OGG_LOCATION}/build/intermediates/merged_native_libs/release/mergeReleaseNativeLibs/out/lib/${ANDROID_ABI}/libogg.so)

set(VORBIS_LOCATION ${CMAKE_SOURCE_DIR}/libvorbis)
set(VORBIS_INCLUDE_DIR ${VORBIS_LOCATION}/src/main/libvorbis-android/jni/include)
set(VORBIS_LIBRARY ${VORBIS_LOCATION}/build/intermediates/merged_native_libs/release/mergeReleaseNativeLibs/out/lib/${ANDROID_ABI}/libvorbis.so)
set(VORBISFILE_LIBRARY ${VORBIS_LOCATION}/build/intermediates/merged_native_libs/release/mergeReleaseNativeLibs/out/lib/${ANDROID_ABI}/libvorbis.so)
set(VORBISENC_LIBRARY ${VORBIS_LOCATION}/build/intermediates/merged_native_libs/release/mergeReleaseNativeLibs/out/lib/${ANDROID_ABI}/libvorbis.so)

set(THEORA_LOCATION ${CMAKE_SOURCE_DIR}/app/src/main/jni/libtheora)
set(THEORA_INCLUDE_DIR ${THEORA_LOCATION}/include)
set(THEORA_LIBRARY ${THEORA_LOCATION}/libs/${ANDROID_ABI}/libtheora.a)

set(mimalloc_include ${CMAKE_SOURCE_DIR}/mimalloc/src/main/jni/mimalloc/include)

if (CMAKE_BUILD_TYPE EQUAL "DEBUG")
    set(mimalloc ${CMAKE_SOURCE_DIR}/mimalloc/build/intermediates/merged_native_libs/debug/mergeDebugNativeLibs/out/lib/${ANDROID_ABI}/libmimalloc-debug.so)
else ()
    set(mimalloc ${CMAKE_SOURCE_DIR}/mimalloc/build/intermediates/merged_native_libs/release/mergeReleaseNativeLibs/out/lib/${ANDROID_ABI}/libmimalloc.so)
endif ()

set(LZO_LOCATION ${CMAKE_SOURCE_DIR}/lzo)
set(LZO_INCLUDE_DIR ${LZO_LOCATION}/src/main/jni/lzo/include)
if (CMAKE_BUILD_TYPE EQUAL "DEBUG")
    set(LZO_LIBRARY ${LZO_LOCATION}/build/intermediates/merged_native_libs/debug/mergeDebugNativeLibs/out/lib/${ANDROID_ABI}/liblzo2.so)
else ()
    set(LZO_LIBRARY ${LZO_LOCATION}/build/intermediates/merged_native_libs/release/mergeReleaseNativeLibs/out/lib/${ANDROID_ABI}/liblzo2.so)
endif ()

set(JPEG_LOCATION ${CMAKE_SOURCE_DIR}/jpeg)
set(JPEG_INCLUDE_DIR ${JPEG_LOCATION}/src/main/jni/libjpeg-turbo/src)
if (CMAKE_BUILD_TYPE EQUAL "DEBUG")
    set(JPEG_LIBRARY ${JPEG_LOCATION}/build/intermediates/merged_native_libs/debug/mergeDebugNativeLibs/out/lib/${ANDROID_ABI}/libjpeg.so)
else ()
    set(JPEG_LIBRARY ${JPEG_LOCATION}/build/intermediates/merged_native_libs/release/mergeReleaseNativeLibs/out/lib/${ANDROID_ABI}/libjpeg.so)
endif ()

set(OPENGL_opengl_LIBRARY ${CMAKE_SOURCE_DIR}/regal/build/intermediates/merged_native_libs/release/mergeReleaseNativeLibs/out/lib/${ANDROID_ABI}/libGL.so)

add_subdirectory("${CMAKE_SOURCE_DIR}/app/src/main/jni/xray-16")