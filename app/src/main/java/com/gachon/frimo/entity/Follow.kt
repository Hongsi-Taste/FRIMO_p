package com.gachon.frimo.entity

data class Follow(
     var user_id: Number,
     var follower_id: List<Number>,
     var followee_id: List<Number>,
     var yet_follower_id: List<Number>,
     var yet_followee_id: List<Number>
)