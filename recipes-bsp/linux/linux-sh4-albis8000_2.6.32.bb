COMPATIBLE_MACHINE = "albis8000|ufs913"

require ${META-SH4-NAME}/recipes-bsp/linux/linux-sh4.inc

STXNUMBER = "stx7105"

FILESEXTRAPATHS_prepend := "${THISDIR}/linux-sh4:"

SRC_URI_append += "\
    file://linux-sh4-${MACHINE}_setup_stm24_${STM_PATCH_STR}.patch;patch=1 \
"
