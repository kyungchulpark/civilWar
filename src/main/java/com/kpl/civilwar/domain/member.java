package com.kpl.civilwar.domain;


/***** KPL 회원정보 *****/
/***** 필요 정보 *****/

import java.time.LocalDateTime;

/**
 * 1. ID
 * 2. Password
 * 3. currentTeam
 * 4. joinDate
 */
public class member {
    private String id;
    private String password;
    private String currentTeam;
    private LocalDateTime joinDate;
}
