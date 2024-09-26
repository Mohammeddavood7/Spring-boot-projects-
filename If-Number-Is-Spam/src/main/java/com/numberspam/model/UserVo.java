package com.numberspam.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserVo
{

	private Integer id;
    private String name;
    private Long number;
    private String password;
    private String email;

}

















