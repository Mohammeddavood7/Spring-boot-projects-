package com.numberspam.model;

import com.numberspam.entity.Contact;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto
{
	private Contact contact;

}
