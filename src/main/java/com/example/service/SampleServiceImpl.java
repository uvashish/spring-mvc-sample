package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Sample;

@Service("sampleService")
public class SampleServiceImpl implements SampleService {

	/* (non-Javadoc)
	 * @see com.example.service.SampleService#getSamples()
	 */
	@Override
	public List<Sample> getSamples() {
		List<Sample> samples = new ArrayList<Sample>();
		
		Sample sample = new Sample();
		sample.setDesc("sample desc1");		
		samples.add(sample);
		
		Sample sample2 = new Sample();
		sample2.setDesc("sample desc2");		
		samples.add(sample2);
		
		Sample sample3 = new Sample();
		sample3.setDesc("sample desc3");		
		samples.add(sample3);
		
		return samples;
	}
}
