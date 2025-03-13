package com.ozair.service;

import com.ozair.model.LeaveRequest;
import com.ozair.repository.LeaveRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveRequestServiceImpl implements LeaveRequestService{

    @Autowired
    private LeaveRequestRepository leaveRequestRepository;

    @Override
    public void applyLeave(LeaveRequest leaveRequest) {
        leaveRequest.setStatus("Pending");
        leaveRequestRepository.save(leaveRequest);
    }

    @Override
    public List<LeaveRequest> getAllLeaveRequests() {
        return leaveRequestRepository.findAll();
    }
}
