package wtf.file.kotlin.mapping

import wtf.file.kotlin.color.ColorSpace as KotlinColorSpace
import  wtf.file.api.color.ColorSpace as JavaColorSpace

fun KotlinColorSpace.toJava() = when(this) {
    KotlinColorSpace.GrayScale -> JavaColorSpace.GRAY_SCALE
    KotlinColorSpace.GrayScaleA -> JavaColorSpace.GRAY_SCALE_A
    KotlinColorSpace.DynamicGrayScaleA -> JavaColorSpace.DYNAMIC_GRAY_SCALE_A
    KotlinColorSpace.RGB -> JavaColorSpace.RGB
    KotlinColorSpace.RGBa -> JavaColorSpace.RGBa
    KotlinColorSpace.DynamicRGBa -> JavaColorSpace.DYNAMIC_RGBa
    KotlinColorSpace.CMY -> JavaColorSpace.CMY
    KotlinColorSpace.CMYa -> JavaColorSpace.CMYa
    KotlinColorSpace.DynamicCMYa -> JavaColorSpace.DYNAMIC_CMYa
    KotlinColorSpace.HSV -> JavaColorSpace.HSV
    KotlinColorSpace.HSVa -> JavaColorSpace.HSVa
    KotlinColorSpace.DynamicHSVa -> JavaColorSpace.DYNAMIC_HSVa
    KotlinColorSpace.YCbCr -> JavaColorSpace.YCbCr
    KotlinColorSpace.YCbCrA -> JavaColorSpace.YCbCra
    KotlinColorSpace.DynamicYCbCrA -> JavaColorSpace.DYNAMIC_YCbCra
}

fun JavaColorSpace.toKotlin() = when(this) {
    JavaColorSpace.GRAY_SCALE -> KotlinColorSpace.GrayScale
    JavaColorSpace.GRAY_SCALE_A -> KotlinColorSpace.GrayScaleA
    JavaColorSpace.DYNAMIC_GRAY_SCALE_A -> KotlinColorSpace.DynamicGrayScaleA
    JavaColorSpace.RGB -> KotlinColorSpace.RGB
    JavaColorSpace.RGBa -> KotlinColorSpace.RGBa
    JavaColorSpace.DYNAMIC_RGBa -> KotlinColorSpace.DynamicRGBa
    JavaColorSpace.CMY -> KotlinColorSpace.CMY
    JavaColorSpace.CMYa -> KotlinColorSpace.CMYa
    JavaColorSpace.DYNAMIC_CMYa -> KotlinColorSpace.DynamicCMYa
    JavaColorSpace.HSV -> KotlinColorSpace.HSV
    JavaColorSpace.HSVa -> KotlinColorSpace.HSVa
    JavaColorSpace.DYNAMIC_HSVa -> KotlinColorSpace.DynamicHSVa
    JavaColorSpace.YCbCr -> KotlinColorSpace.YCbCr
    JavaColorSpace.YCbCra -> KotlinColorSpace.YCbCrA
    JavaColorSpace.DYNAMIC_YCbCra -> KotlinColorSpace.DynamicYCbCrA
}
