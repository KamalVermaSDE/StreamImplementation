package com.stream.main;

import java.util.ArrayList;
import java.util.List;

import com.stream.model.StreamModel;

public class StreamMain {

	public static void main(String[] args) {
		List<StreamModel> list = new ArrayList<StreamModel>();

		list.add(StreamModel.builder().id(1).name("kamal").lastName("verma").age(24).build());
		list.add(StreamModel.builder().id(2).name("Amit").lastName("Sharma").age(24).build());

		list.stream().filter(StreamModel -> StreamModel.getAge() == 24)
				.forEach(StreamModel -> System.out.println(StreamModel.getId() + " " + StreamModel.getName() + " "
						+ StreamModel.getLastName() + " " + StreamModel.getAge()));

	}

}
