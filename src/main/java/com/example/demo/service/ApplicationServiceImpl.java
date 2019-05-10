package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Audio;
import com.example.demo.model.AudioModel;
import com.example.demo.model.Avatar;
import com.example.demo.model.AvatarModel;
import com.example.demo.model.BarDataset;
import com.example.demo.model.BarModel;
import com.example.demo.model.BubbleDataset;
import com.example.demo.model.BubbleModel;
import com.example.demo.model.Card;
import com.example.demo.model.CardDes;
import com.example.demo.model.Datum;
import com.example.demo.model.DonutDataset;
import com.example.demo.model.DonutModel;
import com.example.demo.model.Graph;
import com.example.demo.model.GraphModel;
import com.example.demo.model.GraphModelData;
import com.example.demo.model.GraphValue;
import com.example.demo.model.Graphs;
import com.example.demo.model.LineDataset;
import com.example.demo.model.LineModel;
import com.example.demo.model.MixedDataset;
import com.example.demo.model.MixedModel;
import com.example.demo.model.Normal;
import com.example.demo.model.NormalDescModel;
import com.example.demo.model.NormalOne;
import com.example.demo.model.NormalTwo;
import com.example.demo.model.PieDataset;
import com.example.demo.model.PieModel;
import com.example.demo.model.PolarAreaDataset;
import com.example.demo.model.PolarAreaModel;
import com.example.demo.model.RadarDataset;
import com.example.demo.model.RadarModel;
import com.example.demo.model.Segment;
import com.example.demo.model.TestDataModel;
import com.example.demo.model.TestDataModelNormal;
import com.example.demo.model.Value;
import com.example.demo.model.ValueNormal;
import com.example.demo.model.Video;
import com.example.demo.model.VideoModel;

@Service
public class ApplicationServiceImpl implements ApplicationService {

	@Override
	public List<Object> getJson() {

		List<Object> testDataModelList = new ArrayList<>();
		TestDataModel testDataModelVideo = new TestDataModel();

		testDataModelVideo.setTitle("Video");
		testDataModelVideo.setValues(Arrays.asList(new Value("video", "/images/DellEMC.png", "DellEMC Mobile",
				"10.10.2018", "This is a sample video",
				"https://cf-e2.streamablevideo.com/video/mp4/4jguk.mp4?token=1522220711-bDlDne%2BuKjOP%2FQVsosf9%2BhxC47FHNwsSvjMX%2Bw6P1Z4%3D"),
				new Value("video", "/images/HaC.png", "Help a Customer", "10.10.2019", "This is a sample video",
						"https://cf-e2.streamablevideo.com/video/mp4/4jguk.mp4?token=1522220711-bDlDne%2BuKjOP%2FQVsosf9%2BhxC47FHNwsSvjMX%2Bw6P1Z4%3D")));

		testDataModelList.add(testDataModelVideo);

		TestDataModel testDataModelAudio = new TestDataModel();

		testDataModelAudio.setTitle("Audio");
		testDataModelAudio.setValues(Arrays.asList(new Value("audio", "/images/DellEMC.png", "DellEMC Mobile", "1.1.12",
				"This is a sample audio",
				"https://audio.clyp.it/of5issec.mp3?Expires=1522241732&Signature=j8PmHWUeuaQO25EEmAsbCnbYtqKMU4rF6Ml-Vckk2BQasxTOmXrtS5bqRn34kRrAxcZH7enFnstXRt~u2oC3Mdusnr~GBvcDCt-dSbfs1gecRa~wiNcIlQozWtBICezMqEbrXjBBt5jpIZOcL~RldS2b5tKYZ7SPGEY8tlsH-vE_&Key-Pair-Id=APKAJ4AMQB3XYIRCZ5PA"),
				new Value("audio", "/images/HaC.png", "Help a Customer", "12.2.04", "This is a sample audio",
						"https://audio.clyp.it/of5issec.mp3?Expires=1522241732&Signature=j8PmHWUeuaQO25EEmAsbCnbYtqKMU4rF6Ml-Vckk2BQasxTOmXrtS5bqRn34kRrAxcZH7enFnstXRt~u2oC3Mdusnr~GBvcDCt-dSbfs1gecRa~wiNcIlQozWtBICezMqEbrXjBBt5jpIZOcL~RldS2b5tKYZ7SPGEY8tlsH-vE_&Key-Pair-Id=APKAJ4AMQB3XYIRCZ5PA")));

		testDataModelList.add(testDataModelAudio);

		TestDataModelNormal testDataModelNormal = new TestDataModelNormal();

		testDataModelNormal.setTitle("Normal Description");

		ValueNormal valueNormalOne = new ValueNormal("description", "/images/DellEMC.png", "DellEMC Mobile",
				"Dell EMC Mobile is your companion for Technology Insight and Product Support. Provides visibility and situational awareness to activities occurring with your DELL EMC products at your fingertips. Stay engaged and aware of your DELL EMC activities with the ability to take command of your environment. Access/browse technical documentation, stay in touch with the latest DELL EMC news and highlights, search the Knowledgebase, manage your full service request lifecycle, and engage with peers in the community support forums. With DELL EMC MOBILE, you always have the support to help you make your next move.",
				"v3.4.4",
				"Dell EMC Mobile is your companion for Technology Insight and Product Support. Provides visibility and situational awareness to activities occurring with your DELL EMC products at your fingertips. Stay engaged and aware of your DELL EMC activities with the ability to take command of your environment. Access/browse technical documentation, stay in touch with the latest DELL EMC news and highlights, search the Knowledgebase, manage your full service request lifecycle, and engage with peers in the community support forums. With DELL EMC MOBILE, you always have the support to help you make your next move.",
				Arrays.asList("https://i.imgur.com/qBnk1Bh.jpg", "https://i.imgur.com/qBnk1Bh.jpg"), "some message",
				"some_subject", "sampleName.png", "https://i.imgur.com/qBnk1Bh.jpg");
		ValueNormal valueNormalTwo = new ValueNormal("description", "/images/HaC.png", "Help a Customer",
				"The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell’s existing Help a Customer service and support flows.",
				"v1.1.4",
				"The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell’s existing Help a Customer service and support flows.",
				Arrays.asList("https://i.imgur.com/qBnk1Bh.jpg"), "some message", "some_subject", "sampleName.png",
				"https://i.imgur.com/qBnk1Bh.jpg");
		ValueNormal valueNormalThree = new ValueNormal("description", "/images/HaC.png", "Help a Customer",
				"The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell’s existing Help a Customer service and support flows.",
				"v1.1.4",
				"The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell’s existing Help a Customer service and support flows.",
				Arrays.asList(""), "", "", "", "");
		testDataModelNormal.setValues(Arrays.asList(valueNormalOne, valueNormalTwo, valueNormalThree));

		testDataModelList.add(testDataModelNormal);

		GraphModel graphModel = new GraphModel();
		/*
		 * graphModel.setTitle("Graphs"); graphModel.setValues(Arrays.asList(new
		 * Graph("graph", "/images/DellEMC.png", "DellEMC Mobile",
		 * "Dell EMC Mobile is your companion for ", "v3.4.4",
		 * "Dell EMC Mobile is your companion for Technology Insight and Product Support. Provides visibility and situational awareness to activities occurring with your DELL EMC products at your fingertips. Stay engaged and aware of your DELL EMC activities with the ability to take command of your environment. Access/browse technical documentation, stay in touch with the latest DELL EMC news and highlights, search the Knowledgebase, manage your full service request lifecycle, and engage with peers in the community support forums. With DELL EMC MOBILE, you always have the support to help you make your next move."
		 * , Arrays.asList(new GraphValue("bar", "bar", "/get/data/bar"), new
		 * GraphValue("pie", "pie", "/get/data/pie")))));
		 * graphModel.setValues(Arrays.asList(new Graph("graph", "/images/HaC.png",
		 * "Help a Customer", "The HaC (Help a Customer) Mobile App empowers all ",
		 * "v1.1.4",
		 * "The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell’s existing Help a Customer service and support flows."
		 * , Arrays.asList(new GraphValue("bar", "sampleTitle", "/get/data/bar")))));
		 * 
		 */ testDataModelList.add(graphModel);

		return testDataModelList;
	}

	@Override
	public BarModel sendBarData() {
		BarModel barModel = new BarModel();

		List<String> labels = Arrays.asList("Red", "Brown", "Blue", "Yellow", "Green", "Purple", "Orange");

		barModel.setLabels(labels);

		List<BarDataset> barDataSetList = new ArrayList<>();

		BarDataset barDataset = new BarDataset();
		barDataset.setLabel("# of Votes");
		barDataset.setData(Arrays.asList(11, 15, 22, 4, 6, 2, 3));
		barDataset.setBackgroundColor(Arrays.asList("rgba(255, 99, 132, 0.2)", "rgba(244, 164, 96, 0.8)",
				"rgba(54, 162, 235, 0.2)", "rgba(255, 206, 86, 0.2)", "rgba(75, 192, 192, 0.2)",
				"rgba(153, 102, 255, 0.2)", "rgba(255, 159, 64, 0.2)"));
		barDataset.setBorderColor(Arrays.asList("rgba(255,99,132,1)", "rgba(244, 164, 96, 1)", "rgba(54, 162, 235, 1)",
				"rgba(255, 206, 86, 1)", "rgba(75, 192, 192, 1)", "rgba(153, 102, 255, 1)", "rgba(255, 159, 64, 1)"));
		barDataset.setBorderWidth(1);
		barDataSetList.add(barDataset);
		barModel.setDatasets(barDataSetList);
		return barModel;
	}

	@Override
	public DonutModel sendDonutData() {

		DonutModel donutModel = new DonutModel();

		List<String> labels = Arrays.asList("Red", "Brown", "Blue", "Yellow", "Green", "Purple", "Orange");

		donutModel.setLabels(labels);

		List<DonutDataset> donutDataSetList = new ArrayList<>();

		DonutDataset donutDataset = new DonutDataset();
		donutDataset.setLabel("# of Votes");
		donutDataset.setData(Arrays.asList(12, 19, 3, 5, 2, 3, 6));
		donutDataset.setBackgroundColor(Arrays.asList("rgba(255, 99, 132, 0.2)", "rgba(244, 164, 96, 0.8)",
				"rgba(54, 162, 235, 0.2)", "rgba(255, 206, 86, 0.2)", "rgba(75, 192, 192, 0.2)",
				"rgba(153, 102, 255, 0.2)", "rgba(255, 159, 64, 0.2)"));
		donutDataset.setHoverBackgroundColor(
				Arrays.asList("#FF6384", "#551a8b", "#36A2EB", "#FFCE56", "#FF6384", "#36A2EB", "#FFCE56"));

		donutDataSetList.add(donutDataset);
		donutModel.setDatasets(donutDataSetList);
		return donutModel;

	}

	@Override
	public LineModel sendLineData() {
		LineModel lineModel = new LineModel();

		lineModel.setLabels(Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August"));

		LineDataset lineDatasetOne = new LineDataset("Initial Dataset", "false", 0.1F, "rgba(75,192,192,0.4)",
				"rgba(75,192,192,1)", "butt", Arrays.asList(), 0.0F, "miter", "rgba(75,192,192,1)", "#fff", 1, 5,
				"rgba(75,192,192,1)", "rgba(220,220,220,1)", 2, 1, 10, Arrays.asList(65, 59, 80, 81, 56, 55, 40, 32),
				"false");

		LineDataset lineDatasetTwo = new LineDataset("Final Dataset", "false", 0.1F, "rgba(175,92,192,0.4)",
				"rgba(31,156,156,1)", "butt", Arrays.asList(5, 8), 0.0F, "miter", "rgba(31,156,156,1)", "#fff", 1, 5,
				"rgba(31,156,156,1)", "rgba(220,220,220,1)", 2, 1, 10, Arrays.asList(15, 39, 50, 81, 51, 55, 30, 70),
				"false");

		lineModel.setDatasets(Arrays.asList(lineDatasetOne, lineDatasetTwo));

		return lineModel;
	}

	@Override
	public RadarModel sendRadarData() {

		RadarModel radarModel = new RadarModel();

		radarModel
				.setLabels(Arrays.asList("Eating", "Drinking", "Playing", "Designing", "Coding", "Dancing", "Running"));

		RadarDataset radarDatasetOne = new RadarDataset("Initial Dataset", "rgba(179,181,198,0.2)",
				"rgba(179,181,198,1)", "rgba(179,181,198,1)", "#fff", "#fff", "rgba(179,181,198,1)",
				Arrays.asList(65, 59, 90, 81, 56, 55, 40));

		RadarDataset radarDatasetTwo = new RadarDataset("Final Dataset", "rgba(255,99,132,0.2)", "rgba(255,99,132,1)",
				"rgba(255,99,132,1)", "#fff", "#fff", "rgba(255,99,132,1)", Arrays.asList(28, 48, 40, 19, 96, 27, 100));

		radarModel.setDatasets(Arrays.asList(radarDatasetOne, radarDatasetTwo));

		return radarModel;
	}

	@Override
	public PolarAreaModel sendPolarareaData() {

		PolarAreaModel polarAreaModel = new PolarAreaModel();

		polarAreaModel.setLabels(Arrays.asList("Red", "Green", "Yellow", "Grey", "Blue"));

		PolarAreaDataset polarAreaDatasetOne = new PolarAreaDataset(Arrays.asList(11, 16, 7, 3, 14),
				Arrays.asList("#FF6384", "#4BC0C0", "#FFCE56", "#E7E9ED", "#36A2EB"), "Current Dataset");

		polarAreaModel.setDatasets(Arrays.asList(polarAreaDatasetOne));

		return polarAreaModel;
	}

	@Override
	public PieModel sendPieData() {

		PieModel pieModel = new PieModel();

		pieModel.setLabels(Arrays.asList("Red", "Blue", "Yellow"));

		PieDataset pieDataset = new PieDataset(Arrays.asList(300, 50, 100),
				Arrays.asList("#FF6384", "#36A2EB", "#FFCE56"), Arrays.asList("#FF6384", "#36A2EB", "#FFCE56"));

		pieModel.setDatasets(Arrays.asList(pieDataset));

		return pieModel;
	}

	@Override
	public BubbleModel sendBubbleData() {

		BubbleModel bubbleModel = new BubbleModel();
		BubbleDataset bubbleDataset = new BubbleDataset("Initial Dataset",
				Arrays.asList(new Datum(20, 30, 15), new Datum(40, 10, 10)), "#FF6384", "#FF6384");

		List<BubbleDataset> datasets = Arrays.asList(bubbleDataset);
		bubbleModel.setDatasets(datasets);

		return bubbleModel;
	}

	@Override
	public MixedModel sendMixedData() {
		MixedModel mixedModel = new MixedModel();

		mixedModel.setLabels(Arrays.asList("Item 1", "Item 2", "Item 3"));

		mixedModel.setDatasets(
				Arrays.asList(new MixedDataset("bar", "Bar Component", Arrays.asList(10, 20, 30), "#F5DEB3"),
						new MixedDataset("line", "Line Component", Arrays.asList(30, 20, 10), "#F5DEB3")));

		return mixedModel;
	}

	@Override
	public AvatarModel avatar() {
		AvatarModel avatarModel = new AvatarModel();
		avatarModel.setAvatar(Arrays.asList(new Avatar("+91-9876543210", "Advisor", "DELL 6", "Sankar Narayanan",
				"https://www.w3schools.com/w3images/avatar2.png")));
		return avatarModel;
	}

	@Override
	public Segment segment() {
		Segment segment = new Segment("https://fakeflask.herokuapp.com/", "https://fakeflask.herokuapp.com/",
				"https://fakeflask.herokuapp.com/");

		return segment;
	}

	@Override
	public GraphModelData graph() {

		GraphModelData graphModelData = new GraphModelData();

		graphModelData.setGraphs(
				Arrays.asList(new Graphs("SampleTitle", "bar", "https://fakeflask.herokuapp.com/get/data/bar")));
		return graphModelData;
	}

	@Override
	public List<Object> card() {
		List<Object> cardList = new ArrayList<>();

		cardList.add(new Card("description", "https://fakeflask.herokuapp.com//card-images/1.jpg", "http://google.com",
				"The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell\\u2019s existing Help a Customer service and support flows.",
				"Help a Customer"));
		cardList.add(new Card("description", "https://fakeflask.herokuapp.com//card-images/2.jpg",
				"https://i.imgur.com/qBnk1Bh.jpg",
				"The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell\\u2019s existing Help a Customer service and support flows.",
				"Help a Customer"));

		cardList.add(new Card("description", "https://fakeflask.herokuapp.com//card-images/6.jpg",
				"https://i.imgur.com/qBnk1Bh.jpg",
				"The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell\\u2019s existing Help a Customer service and support flows.",
				"Help a Customer"));

		cardList.add(new Card("description", "https://fakeflask.herokuapp.com//card-images/7.jpg", "www.bing.com",
				"The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell\\u2019s existing Help a Customer service and support flows.",
				"Help a Customer"));

		cardList.add(new Card("description", "https://fakeflask.herokuapp.com//card-images/6.jpg",
				"https://i.imgur.com/qBnk1Bh.jpg",
				"The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell\\u2019s existing Help a Customer service and support flows.",
				"Help a Customer"));

		cardList.add(new Card("description", "https://fakeflask.herokuapp.com//card-images/7.jpg",
				"https://i.imgur.com/qBnk1Bh.jpg",
				"The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell\\u2019s existing Help a Customer service and support flows.",
				"Help a Customer"));

		cardList.add(new Card("description", "https://fakeflask.herokuapp.com//card-images/6.jpg",
				"https://i.imgur.com/qBnk1Bh.jpg",
				"The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell\\u2019s existing Help a Customer service and support flows.",
				"Help a Customer"));

		cardList.add(new Card("description", "https://fakeflask.herokuapp.com//card-images/7.jpg",
				"https://i.imgur.com/qBnk1Bh.jpg",
				"The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell\\u2019s existing Help a Customer service and support flows.",
				"Help a Customer"));

		cardList.add(new Card("description", "https://fakeflask.herokuapp.com//card-images/8.jpg",
				"https://i.imgur.com/qBnk1Bh.jpg",
				"The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell\\u2019s existing Help a Customer service and support flows.",
				"Help a Customer"));

		cardList.add(new Card("description", "https://fakeflask.herokuapp.com//card-images/9.jpg",
				"https://i.imgur.com/qBnk1Bh.jpg",
				"The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell\\u2019s existing Help a Customer service and support flows.",
				"Help a Customer"));

		cardList.add(new Card("description", "https://fakeflask.herokuapp.com//card-images/4.jpg",
				"https://i.imgur.com/qBnk1Bh.jpg",
				"The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell\\u2019s existing Help a Customer service and support flows.",
				"Help a Customer"));

		cardList.add(new Card("description", "https://fakeflask.herokuapp.com//card-images/5.jpg",
				"https://i.imgur.com/qBnk1Bh.jpg",
				"The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell\\u2019s existing Help a Customer service and support flows.",
				"Help a Customer"));

		cardList.add(new CardDes("description",
				"Dell EMC Mobile is your companion for Technology Insight and Product Support. Provides visibility and situational awareness to activities occurring with your DELL EMC products at your fingertips. Stay engaged and aware of your DELL EMC activities with the ability to take command of your environment. Access/browse technical documentation, stay in touch with the latest DELL EMC news and highlights, search the Knowledgebase, manage your full service request lifecycle, and engage with peers in the community support forums. With DELL EMC MOBILE, you always have the support to help you make your next move.",
				"https://fakeflask.herokuapp.com//card-images/1.jpg", "https://i.imgur.com/qBnk1Bh.jpg",
				"Dell EMC Mobile is your companion for Technology Insight and Product Support. Provides visibility and situational awareness to activities occurring with your DELL EMC products at your fingertips. Stay engaged and aware of your DELL EMC activities with the ability to take command of your environment. Access/browse technical documentation, stay in touch with the latest DELL EMC news and highlights, search the Knowledgebase, manage your full service request lifecycle, and engage with peers in the community support forums. With DELL EMC MOBILE, you always have the support to help you make your next move.",
				"DellEMC Mobile", "v3.4.4"));

		cardList.add(new Card("description", "https://fakeflask.herokuapp.com//card-images/2.jpg",
				"https://i.imgur.com/qBnk1Bh.jpg",
				"The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell\\u2019s existing Help a Customer service and support flows.",
				"Help a Customer"));

		cardList.add(new Card("description", "https://fakeflask.herokuapp.com//card-images/3.jpg",
				"https://i.imgur.com/qBnk1Bh.jpg",
				"The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell\\u2019s existing Help a Customer service and support flows.",
				"Help a Customer"));

		return cardList;
	}

	@Override
	public List<Object> herokuapp() {
		List<Object> herokuappList = new ArrayList<>();

		List<Object> videoList = new ArrayList<>();

		VideoModel videoModel = new VideoModel();
		videoModel.setTitle("Video");

		videoModel.setValues(Arrays.asList(new Video("video", "https://fakeflask.herokuapp.com//images/DellEMC.png",
				"This is a sample video", "DellEMC Mobile",
				"https://cf-e2.streamablevideo.com/video/mp4/4jguk.mp4?token=1522220711-bDlDne%2BuKjOP%2FQVsosf9%2BhxC47FHNwsSvjMX%2Bw6P1Z4%3D",
				"10.10.2018"),
				new Video("video", "https://fakeflask.herokuapp.com//images/HaC.png", "This is a sample video",
						"Help a Customer",
						"https://cf-e2.streamablevideo.com/video/mp4/4jguk.mp4?token=1522220711-bDlDne%2BuKjOP%2FQVsosf9%2BhxC47FHNwsSvjMX%2Bw6P1Z4%3D",
						"10.10.2019")));

		videoList.add(videoModel);

		herokuappList.add(videoModel);

		// Audio
		List<Object> audioList = new ArrayList<>();

		AudioModel audioModel = new AudioModel();
		audioModel.setTitle("Audio");

		audioModel.setValues(Arrays.asList(new Audio("audio", "https://fakeflask.herokuapp.com//images/DellEMC.png",
				"This is a sample audio", "DellEMC Mobile",
				"https://audio.clyp.it/of5issec.mp3?Expires=1522241732&Signature=j8PmHWUeuaQO25EEmAsbCnbYtqKMU4rF6Ml-Vckk2BQasxTOmXrtS5bqRn34kRrAxcZH7enFnstXRt~u2oC3Mdusnr~GBvcDCt-dSbfs1gecRa~wiNcIlQozWtBICezMqEbrXjBBt5jpIZOcL~RldS2b5tKYZ7SPGEY8tlsH-vE_&Key-Pair-Id=APKAJ4AMQB3XYIRCZ5PA",
				"1.1.12"),
				new Audio("audio", "https://fakeflask.herokuapp.com//images/HaC.png", "This is a sample audio",
						"Help a Customer",
						"https://audio.clyp.it/of5issec.mp3?Expires=1522241732&Signature=j8PmHWUeuaQO25EEmAsbCnbYtqKMU4rF6Ml-Vckk2BQasxTOmXrtS5bqRn34kRrAxcZH7enFnstXRt~u2oC3Mdusnr~GBvcDCt-dSbfs1gecRa~wiNcIlQozWtBICezMqEbrXjBBt5jpIZOcL~RldS2b5tKYZ7SPGEY8tlsH-vE_&Key-Pair-Id=APKAJ4AMQB3XYIRCZ5PA",
						"12.2.04")));

		audioList.add(audioModel);

		herokuappList.add(audioModel);

		// Normal

		List<Object> normalList = new ArrayList<>();

		NormalDescModel normalDescModel = new NormalDescModel();
		normalDescModel.setTitle("Normal Description");

		normalDescModel.setValues(Arrays.asList(new Normal("description",
				"Dell EMC Mobile is your companion for Technology Insight and Product Support. Provides visibility and situational awareness to activities occurring with your DELL EMC products at your fingertips. Stay engaged and aware of your DELL EMC activities with the ability to take command of your environment. Access/browse technical documentation, stay in touch with the latest DELL EMC news and highlights, search the Knowledgebase, manage your full service request lifecycle, and engage with peers in the community support forums. With DELL EMC MOBILE, you always have the support to help you make your next move.",
				"https://i.imgur.com/qBnk1Bh.jpg", "https://fakeflask.herokuapp.com//images/DellEMC.png",
				"some message", "sampleName.png",
				Arrays.asList("https://i.imgur.com/qBnk1Bh.jpg", "https://i.imgur.com/qBnk1Bh.jpg"),
				"Dell EMC Mobile is your companion for Technology Insight and Product Support. Provides visibility and situational awareness to activities occurring with your DELL EMC products at your fingertips. Stay engaged and aware of your DELL EMC activities with the ability to take command of your environment. Access/browse technical documentation, stay in touch with the latest DELL EMC news and highlights, search the Knowledgebase, manage your full service request lifecycle, and engage with peers in the community support forums. With DELL EMC MOBILE, you always have the support to help you make your next move.",
				"some_subject", "DellEMC Mobile", "v3.4.4"),
				new NormalOne("description",
						"The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell\\u2019s existing Help a Customer service and support flows.",
						"https://i.imgur.com/qBnk1Bh.jpg", "https://fakeflask.herokuapp.com//images/HaC.png",
						"some message", "sampleName.png", "https://i.imgur.com/qBnk1Bh.jpg",
						"The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell\\u2019s existing Help a Customer service and support flows.",
						"some_subject", "Help a Customer", "v1.1.4"),
				new NormalTwo("description",
						"The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell\\u2019s existing Help a Customer service and support flows.",
						"https://fakeflask.herokuapp.com//images/HaC.png",
						"The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell\\u2019s existing Help a Customer service and support flows.",
						"Help a Customer", "v1.1.4")));
		normalList.add(normalDescModel);

		herokuappList.add(normalDescModel);

		// Graph
		GraphModel graphmodel = new GraphModel();
		graphmodel.setTitle("Graphs");
		graphmodel.setValues(Arrays.asList(new Graph("graph",
				"Dell EMC Mobile is your companion for Technology Insight and Product Support. Provides visibility and situational awareness to activities occurring with your DELL EMC products at your fingertips. Stay engaged and aware of your DELL EMC activities with the ability to take command of your environment. Access/browse technical documentation, stay in touch with the latest DELL EMC news and highlights, search the Knowledgebase, manage your full service request lifecycle, and engage with peers in the community support forums. With DELL EMC MOBILE, you always have the support to help you make your next move.",
				Arrays.asList(new GraphValue("bar", "bar", "https://fakeflask.herokuapp.com//get/data/bar"),
						new GraphValue("pie", "pie", "https://fakeflask.herokuapp.com//get/data/pie")),
				"https://fakeflask.herokuapp.com//images/DellEMC.png", "Dell EMC Mobile is your companion for ",
				"DellEMC Mobile", "v3.4.4"),
				new Graph("graph",
						"The HaC (Help a Customer) Mobile App empowers all team members to take action on behalf of our customers anytime, anywhere. It provides a convenient intake method to capture customer feedback & issue details and seamlessly connect to Dell\\u2019s existing Help a Customer service and support flows.",
						Arrays.asList(
								new GraphValue("sampleTitle", "bar", "https://fakeflask.herokuapp.com//get/data/bar")),
						"https://fakeflask.herokuapp.com//images/HaC.png",
						"The HaC (Help a Customer) Mobile App empowers all ", "Help a Customer", "v1.1.4")));
		herokuappList.add(graphmodel);
		return herokuappList;
	}

}
