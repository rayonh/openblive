package cn.jarrodquan.openblive.websocket.data

import com.fasterxml.jackson.annotation.JsonProperty

data class LikeData(
    /**
     * 用户昵称
     */
    val uname: String,
    /**
     * 用户UID
     */
    val uid: Long,
    /**
     * 用户头像
     */
    val uface: String,
    /**
     * 弹幕发送时间秒级时间戳
     */
    val timestamp: Long,
    /**
     * 发生的直播间
     */
    @JsonProperty("room_id")
    val roomId: Long,
    /**
     * 点赞文案( “xxx点赞了”)
     */
    @JsonProperty("like_text")
    val likeText: String,
    /**
     * 对单个用户最近2秒的点赞次数聚合
     */
    @JsonProperty("like_count")
    val likeCount: Long,
    /**
     * 该房间粉丝勋章佩戴情况
     */
    @JsonProperty("fans_medal_wearing_status")
    val fansMedalWearingStatus: Boolean,
    /**
     * 粉丝勋章名
     */
    @JsonProperty("fans_medal_name")
    val fansMedalName: String,
    /**
     * 对应房间勋章信息
     *
     */
    @JsonProperty("fans_medal_level")
    val fansMedalLevel: String
) : OpenBLiveData()