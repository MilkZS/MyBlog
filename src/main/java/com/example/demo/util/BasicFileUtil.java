package com.example.demo.util;

import org.apache.commons.lang3.StringUtils;

public class BasicFileUtil {

    public static boolean isAbsFile(String fileName) {
        return fileName.contains(":") || fileName.startsWith("\\");
//        if (OSUtil.isWinOS()) {
//            // windows 操作系统时，绝对地址形如  c:\descktop
//            return fileName.contains(":") || fileName.startsWith("\\");
//        } else {
//            // mac or linux
//            return fileName.startsWith("/");
//        }
    }

    /**
     * 将用户目录下地址~/xxx 转换为绝对地址
     *
     * @param path
     * @return
     */
    public static String parseHomeDir2AbsDir(String path) {
        String homeDir = System.getProperties().getProperty("user.home");
        return StringUtils.replace(path, "~", homeDir);
    }

}
