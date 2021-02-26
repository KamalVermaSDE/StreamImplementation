package com.stream.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Builder
    public class StreamModel {
	private int id;
	private String name;
	private String lastName;
	private int age;
	

}
