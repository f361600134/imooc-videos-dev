package com.imooc.cofig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="com.imooc")
public class ResourceConfig {

	public static String zookeeperServer;
	public static String bgmServer;
	public static String fileSpace;
	public static String ffmpegSpace;

//	public String getFfmpegSpace() {
//		return ffmpegSpace;
//	}
	public void setFfmpegSpace(String ffmpegSpace) {
		ResourceConfig.ffmpegSpace = ffmpegSpace;
	}
//	public String getZookeeperServer() {
//		return zookeeperServer;
//	}
	public void setZookeeperServer(String zookeeperServer) {
		ResourceConfig.zookeeperServer = zookeeperServer;
	}
//	public String getBgmServer() {
//		return bgmServer;
//	}
	public void setBgmServer(String bgmServer) {
		ResourceConfig.bgmServer = bgmServer;
	}
//	public String getFileSpace() {
//		return fileSpace;
//	}
	public void setFileSpace(String fileSpace) {
		ResourceConfig.fileSpace = fileSpace;
	}
}
