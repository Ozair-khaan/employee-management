package com.ozair.controller;

import com.ozair.model.LeaveRequest;
import com.ozair.service.LeaveRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/applyLeave")
public class LeaveRequestController {

    @Autowired
    private LeaveRequestService leaveRequestService;

    @GetMapping
    public String showLeaveForm(Model model) {
        model.addAttribute("leaveRequest", new LeaveRequest());
        return "apply-leave";
    }

    @PostMapping
    public String applyLeave(@ModelAttribute LeaveRequest leaveRequest) {
        leaveRequestService.applyLeave(leaveRequest);
        return "redirect:/applyLeave?success";
    }

    @GetMapping("/list")
    public String showLeaveRequests(Model model) {
        List<LeaveRequest> leaveRequests = leaveRequestService.getAllLeaveRequests();
        model.addAttribute("leaveRequests", leaveRequests);
        return "leave-list";
    }
}
