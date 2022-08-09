package com.gachon.frimo.entity

import java.util.*

data class User (
    var user_id: Long,
    var user_name: String,
    var certification: String,
    var register: Date,
    var phone: String,
    var region: Region,
    var interest: List<Interest>,
    var profile_image: ProfileImage
)