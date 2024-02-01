package cn.jarrodquan.openblive.websocket.data

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 礼物信息
 */
data class SendGiftData(
    /**
     * 房间号
     */
    @JsonProperty("room_id")
    val roomId: Long,
    /**
     * 送礼用户UID
     */
    val uid: Long,
    /**
     * 送礼用户昵称
     */
    val uname: String,
    /**
     * 送礼用户头像
     */
    val uface: String,
    /**
     * 道具id(盲盒:爆出道具id)
     */
    @JsonProperty("gift_id")
    val giftId: Long,
    /**
     * 道具名(盲盒:爆出道具名)
     */
    @JsonProperty("gift_name")
    val giftName: String,
    /**
     * 赠送道具数量
     */
    @JsonProperty("gift_num")
    val giftNum: Long,
    /**
     * 支付金额(1000 = 1元 = 10电池),盲盒:爆出道具的价值
     */
    val price: Long,
    /**
     * 是否是付费道具
     */
    val paid: Boolean,
    /**
     * 实际送礼人的勋章信息
     */
    @JsonProperty("fans_medal_level")
    val fansMedalLevel: Long,
    /**
     * 粉丝勋章名
     */
    @JsonProperty("fans_medal_name")
    val fansMedalName: String,
    /**
     * 该房间粉丝勋章佩戴情况
     */
    @JsonProperty("fans_medal_wearing_status")
    val fansMedalWearingStatus: Boolean,
    /**
     * 大航海等级
     */
    @JsonProperty("guard_level")
    val guardLevel: Long,
    /**
     * 收礼时间秒级时间戳
     */
    val timestamp: Long,
    /**
     * 主播信息
     */
    @JsonProperty("anchor_info")
    val anchorInfo: AnchorInfo,
    /**
     * 消息唯一id
     */
    @JsonProperty("msg_id")
    val msgId: String,
    /**
     * 道具icon
     */
    @JsonProperty("gift_icon")
    val giftIcon: String,
    /**
     * 是否是combo道具
     */
    @JsonProperty("combo_gift")
    val comboGift: Boolean,
    /**
     * 连击信息
     */
    @JsonProperty("combo_info")
    val comboInfo: ComboInfo,
) : OpenBLiveData() {
    /**
     * 主播信息
     */
    data class AnchorInfo(
        /**
         * 主播uid
         */
        val uid: Long,
        @JsonProperty("open_id")
        val openId: String,
        /**
         * 主播昵称
         */
        val uname: String,
        /**
         * 主播头像
         */
        val uface: String,
    )

    /**
     * 连击信息
     */
    data class ComboInfo(
        /**
         * 每次连击赠送的道具数量
         */
        @JsonProperty("combo_base_num")
        val comboBaseNum: Long,
        /**
         * 连击次数
         */
        @JsonProperty("combo_count")
        val comboCount: Long,
        /**
         * 连击id
         */
        @JsonProperty("combo_id")
        val comboId: String,
        /**
         * 连击有效期秒
         */
        @JsonProperty("combo_timeout")
        val comboTimeout: Long,
    )
}
