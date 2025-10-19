/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.oss.cloud;


import io.renren.common.validator.group.AliyunGroup;
import io.renren.common.validator.group.QcloudGroup;
import io.renren.common.validator.group.QiniuGroup;
import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 云存储配置信息
 *
 * @author Mark sunlightcs@gmail.com
 */
@Data
public class CloudStorageConfig implements Serializable {
    private static final long serialVersionUID = 1L;

    //类型 1：七牛  2：阿里云  3：腾讯云
    @Range(min=1, max=3, message = "类型错误")
    private Integer type;

    //七牛绑定的域名
    @NotBlank(message="七牛绑定的域名不能为空", groups = QiniuGroup.class)
    @URL(message = "七牛绑定的域名格式不正确", groups = QiniuGroup.class)
    private String qiniuDomain;
    //七牛路径前缀
    private String qiniuPrefix;
    //七牛ACCESS_KEY
    @NotBlank(message="七牛AccessKey不能为空", groups = QiniuGroup.class)
    private String qiniuAccessKey;
    //七牛SECRET_KEY
    @NotBlank(message="七牛SecretKey不能为空", groups = QiniuGroup.class)
    private String qiniuSecretKey;
    //七牛存储空间名
    @NotBlank(message="七牛空间名不能为空", groups = QiniuGroup.class)
    private String qiniuBucketName;

    //阿里云绑定的域名
    @NotBlank(message="阿里云绑定的域名不能为空", groups = AliyunGroup.class)
    @URL(message = "阿里云绑定的域名格式不正确", groups = AliyunGroup.class)
    private String aliyunDomain;
    //阿里云路径前缀
    private String aliyunPrefix;
    //阿里云EndPoint
    @NotBlank(message="阿里云EndPoint不能为空", groups = AliyunGroup.class)
    private String aliyunEndPoint;
    //阿里云AccessKeyId
    @NotBlank(message="阿里云AccessKeyId不能为空", groups = AliyunGroup.class)
    private String aliyunAccessKeyId;
    //阿里云AccessKeySecret
    @NotBlank(message="阿里云AccessKeySecret不能为空", groups = AliyunGroup.class)
    private String aliyunAccessKeySecret;
    //阿里云BucketName
    @NotBlank(message="阿里云BucketName不能为空", groups = AliyunGroup.class)
    private String aliyunBucketName;

    //腾讯云绑定的域名
    @NotBlank(message="腾讯云绑定的域名不能为空", groups = QcloudGroup.class)
    @URL(message = "腾讯云绑定的域名格式不正确", groups = QcloudGroup.class)
    private String qcloudDomain;
    //腾讯云路径前缀
    private String qcloudPrefix;
    //腾讯云AppId
    @NotNull(message="腾讯云AppId不能为空", groups = QcloudGroup.class)
    private Integer qcloudAppId;
    //腾讯云SecretId
    @NotBlank(message="腾讯云SecretId不能为空", groups = QcloudGroup.class)
    private String qcloudSecretId;
    //腾讯云SecretKey
    @NotBlank(message="腾讯云SecretKey不能为空", groups = QcloudGroup.class)
    private String qcloudSecretKey;
    //腾讯云BucketName
    @NotBlank(message="腾讯云BucketName不能为空", groups = QcloudGroup.class)
    private String qcloudBucketName;
    //腾讯云COS所属地区
    @NotBlank(message="所属地区不能为空", groups = QcloudGroup.class)
    private String qcloudRegion;

    public @Range(min = 1, max = 3, message = "类型错误") Integer getType() {
        return type;
    }

    public void setType(@Range(min = 1, max = 3, message = "类型错误") Integer type) {
        this.type = type;
    }

    public @NotBlank(message = "七牛绑定的域名不能为空", groups = QiniuGroup.class) @URL(message = "七牛绑定的域名格式不正确", groups = QiniuGroup.class) String getQiniuDomain() {
        return qiniuDomain;
    }

    public void setQiniuDomain(@NotBlank(message = "七牛绑定的域名不能为空", groups = QiniuGroup.class) @URL(message = "七牛绑定的域名格式不正确", groups = QiniuGroup.class) String qiniuDomain) {
        this.qiniuDomain = qiniuDomain;
    }

    public String getQiniuPrefix() {
        return qiniuPrefix;
    }

    public void setQiniuPrefix(String qiniuPrefix) {
        this.qiniuPrefix = qiniuPrefix;
    }

    public @NotBlank(message = "七牛AccessKey不能为空", groups = QiniuGroup.class) String getQiniuAccessKey() {
        return qiniuAccessKey;
    }

    public void setQiniuAccessKey(@NotBlank(message = "七牛AccessKey不能为空", groups = QiniuGroup.class) String qiniuAccessKey) {
        this.qiniuAccessKey = qiniuAccessKey;
    }

    public @NotBlank(message = "七牛SecretKey不能为空", groups = QiniuGroup.class) String getQiniuSecretKey() {
        return qiniuSecretKey;
    }

    public void setQiniuSecretKey(@NotBlank(message = "七牛SecretKey不能为空", groups = QiniuGroup.class) String qiniuSecretKey) {
        this.qiniuSecretKey = qiniuSecretKey;
    }

    public @NotBlank(message = "七牛空间名不能为空", groups = QiniuGroup.class) String getQiniuBucketName() {
        return qiniuBucketName;
    }

    public void setQiniuBucketName(@NotBlank(message = "七牛空间名不能为空", groups = QiniuGroup.class) String qiniuBucketName) {
        this.qiniuBucketName = qiniuBucketName;
    }

    public @NotBlank(message = "阿里云绑定的域名不能为空", groups = AliyunGroup.class) @URL(message = "阿里云绑定的域名格式不正确", groups = AliyunGroup.class) String getAliyunDomain() {
        return aliyunDomain;
    }

    public void setAliyunDomain(@NotBlank(message = "阿里云绑定的域名不能为空", groups = AliyunGroup.class) @URL(message = "阿里云绑定的域名格式不正确", groups = AliyunGroup.class) String aliyunDomain) {
        this.aliyunDomain = aliyunDomain;
    }

    public String getAliyunPrefix() {
        return aliyunPrefix;
    }

    public void setAliyunPrefix(String aliyunPrefix) {
        this.aliyunPrefix = aliyunPrefix;
    }

    public @NotBlank(message = "阿里云EndPoint不能为空", groups = AliyunGroup.class) String getAliyunEndPoint() {
        return aliyunEndPoint;
    }

    public void setAliyunEndPoint(@NotBlank(message = "阿里云EndPoint不能为空", groups = AliyunGroup.class) String aliyunEndPoint) {
        this.aliyunEndPoint = aliyunEndPoint;
    }

    public @NotBlank(message = "阿里云AccessKeyId不能为空", groups = AliyunGroup.class) String getAliyunAccessKeyId() {
        return aliyunAccessKeyId;
    }

    public void setAliyunAccessKeyId(@NotBlank(message = "阿里云AccessKeyId不能为空", groups = AliyunGroup.class) String aliyunAccessKeyId) {
        this.aliyunAccessKeyId = aliyunAccessKeyId;
    }

    public @NotBlank(message = "阿里云AccessKeySecret不能为空", groups = AliyunGroup.class) String getAliyunAccessKeySecret() {
        return aliyunAccessKeySecret;
    }

    public void setAliyunAccessKeySecret(@NotBlank(message = "阿里云AccessKeySecret不能为空", groups = AliyunGroup.class) String aliyunAccessKeySecret) {
        this.aliyunAccessKeySecret = aliyunAccessKeySecret;
    }

    public @NotBlank(message = "阿里云BucketName不能为空", groups = AliyunGroup.class) String getAliyunBucketName() {
        return aliyunBucketName;
    }

    public void setAliyunBucketName(@NotBlank(message = "阿里云BucketName不能为空", groups = AliyunGroup.class) String aliyunBucketName) {
        this.aliyunBucketName = aliyunBucketName;
    }

    public @NotBlank(message = "腾讯云绑定的域名不能为空", groups = QcloudGroup.class) @URL(message = "腾讯云绑定的域名格式不正确", groups = QcloudGroup.class) String getQcloudDomain() {
        return qcloudDomain;
    }

    public void setQcloudDomain(@NotBlank(message = "腾讯云绑定的域名不能为空", groups = QcloudGroup.class) @URL(message = "腾讯云绑定的域名格式不正确", groups = QcloudGroup.class) String qcloudDomain) {
        this.qcloudDomain = qcloudDomain;
    }

    public String getQcloudPrefix() {
        return qcloudPrefix;
    }

    public void setQcloudPrefix(String qcloudPrefix) {
        this.qcloudPrefix = qcloudPrefix;
    }

    public @NotNull(message = "腾讯云AppId不能为空", groups = QcloudGroup.class) Integer getQcloudAppId() {
        return qcloudAppId;
    }

    public void setQcloudAppId(@NotNull(message = "腾讯云AppId不能为空", groups = QcloudGroup.class) Integer qcloudAppId) {
        this.qcloudAppId = qcloudAppId;
    }

    public @NotBlank(message = "腾讯云SecretId不能为空", groups = QcloudGroup.class) String getQcloudSecretId() {
        return qcloudSecretId;
    }

    public void setQcloudSecretId(@NotBlank(message = "腾讯云SecretId不能为空", groups = QcloudGroup.class) String qcloudSecretId) {
        this.qcloudSecretId = qcloudSecretId;
    }

    public @NotBlank(message = "腾讯云SecretKey不能为空", groups = QcloudGroup.class) String getQcloudSecretKey() {
        return qcloudSecretKey;
    }

    public void setQcloudSecretKey(@NotBlank(message = "腾讯云SecretKey不能为空", groups = QcloudGroup.class) String qcloudSecretKey) {
        this.qcloudSecretKey = qcloudSecretKey;
    }

    public @NotBlank(message = "腾讯云BucketName不能为空", groups = QcloudGroup.class) String getQcloudBucketName() {
        return qcloudBucketName;
    }

    public void setQcloudBucketName(@NotBlank(message = "腾讯云BucketName不能为空", groups = QcloudGroup.class) String qcloudBucketName) {
        this.qcloudBucketName = qcloudBucketName;
    }

    public @NotBlank(message = "所属地区不能为空", groups = QcloudGroup.class) String getQcloudRegion() {
        return qcloudRegion;
    }

    public void setQcloudRegion(@NotBlank(message = "所属地区不能为空", groups = QcloudGroup.class) String qcloudRegion) {
        this.qcloudRegion = qcloudRegion;
    }
}
