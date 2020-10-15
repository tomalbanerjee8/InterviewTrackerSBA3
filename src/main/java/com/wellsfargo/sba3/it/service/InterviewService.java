package com.wellsfargo.sba3.it.service;

import java.util.Set;
import java.util.Set;

import com.wellsfargo.sba3.it.exception.InterviewTrackerException;
import com.wellsfargo.sba3.it.model.AttendeeModel;
import com.wellsfargo.sba3.it.model.InterviewModel;
import com.wellsfargo.sba3.it.model.UserModel;

public interface InterviewService {

	InterviewModel add(InterviewModel interview) throws InterviewTrackerException;
	
	boolean deleteInterview(int interviewId) throws InterviewTrackerException;
	
	InterviewModel updateStatus(Integer interviewid, String status) throws InterviewTrackerException;
	
	Set<InterviewModel> getinterview(String interviewName, String interviewerName);
	
	String getInterviewCount();
	
	Set<InterviewModel> getAllInterviewDetails();
	
	Set<UserModel> showUsers(int interviewId) throws InterviewTrackerException;

	String addAttendee(AttendeeModel attendee) throws InterviewTrackerException;

	InterviewModel getInterviewById(int interviewId);;
}
