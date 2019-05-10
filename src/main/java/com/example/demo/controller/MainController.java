package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.AvatarModel;
import com.example.demo.model.BarModel;
import com.example.demo.model.BubbleModel;
import com.example.demo.model.DonutModel;
import com.example.demo.model.GraphModelData;
import com.example.demo.model.LineModel;
import com.example.demo.model.MixedModel;
import com.example.demo.model.PieModel;
import com.example.demo.model.PolarAreaModel;
import com.example.demo.model.RadarModel;
import com.example.demo.model.Segment;
import com.example.demo.service.ApplicationService;

@Controller
public class MainController {

	@Autowired(required = true)
	public ApplicationService applicationService;

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public List<Object> getJson() {

		return applicationService.getJson();
	}

	@RequestMapping(value = "/get/data/bar", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public BarModel sendBarData() {

		return applicationService.sendBarData();
	}

	@RequestMapping(value = "/get/data/donut", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public DonutModel sendDonutData() {

		return applicationService.sendDonutData();
	}

	@RequestMapping(value = "/get/data/line", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public LineModel sendLineData() {

		return applicationService.sendLineData();
	}

	@RequestMapping(value = "/get/data/radar", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public RadarModel sendRadarData() {

		return applicationService.sendRadarData();
	}

	@RequestMapping(value = "/get/data/polararea", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public PolarAreaModel sendPolarareaData() {

		return applicationService.sendPolarareaData();
	}

	@RequestMapping(value = "/get/data/pie", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public PieModel sendPieData() {

		return applicationService.sendPieData();
	}

	@RequestMapping(value = "/get/data/bubble", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public BubbleModel sendBubbleData() {

		return applicationService.sendBubbleData();
	}

	@RequestMapping(value = "/get/data/mixed", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public MixedModel sendMixedData() {

		return applicationService.sendMixedData();
	}

	@RequestMapping(value = "/avatar", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public AvatarModel avatar() {

		return applicationService.avatar();
	}

	@RequestMapping(value = "/segment", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public Segment segment() {

		return applicationService.segment();
	}

	
	@RequestMapping(value = "/graph", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public GraphModelData graph() {

		return applicationService.graph();
	}

	@RequestMapping(value = "/card", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public List<Object> card() {

		return applicationService.card();
	}

	
	@RequestMapping(value = "/herokuapp", method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public Object herokuapp() {

		return applicationService.herokuapp();
	}

	
}