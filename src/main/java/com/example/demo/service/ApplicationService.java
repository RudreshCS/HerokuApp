package com.example.demo.service;

import java.util.List;

import com.example.demo.model.AvatarModel;
import com.example.demo.model.BarModel;
import com.example.demo.model.BubbleModel;
import com.example.demo.model.DonutModel;
import com.example.demo.model.GraphModel;
import com.example.demo.model.GraphModelData;
import com.example.demo.model.LineModel;
import com.example.demo.model.MixedModel;
import com.example.demo.model.PieModel;
import com.example.demo.model.PolarAreaModel;
import com.example.demo.model.RadarModel;
import com.example.demo.model.Segment;

public interface ApplicationService {

	List<Object> getJson();

	BarModel sendBarData();

	DonutModel sendDonutData();

	PieModel sendPieData();

	LineModel sendLineData();

	RadarModel sendRadarData();

	PolarAreaModel sendPolarareaData();

	BubbleModel sendBubbleData();

	MixedModel sendMixedData();

	AvatarModel avatar();

	Segment segment();

	GraphModelData graph();

	List<Object> card();

	List<Object> herokuapp();

}
