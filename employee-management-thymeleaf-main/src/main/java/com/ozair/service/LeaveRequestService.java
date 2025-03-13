package com.ozair.service;

import com.ozair.model.LeaveRequest;

import java.util.List;

public interface LeaveRequestService {

    public void applyLeave(LeaveRequest leaveRequest);

    public List<LeaveRequest> getAllLeaveRequests();

}
