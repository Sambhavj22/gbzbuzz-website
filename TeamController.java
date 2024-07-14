package com.gbjbuzz.controller;

import com.gbjbuzz.model.TeamMember;
import com.gbjbuzz.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/team")
public class TeamController {
    @Autowired
    private TeamRepository teamRepository;

    @GetMapping
    public List<TeamMember> getAllTeamMembers() {
        return teamRepository.findAll();
    }

    @PostMapping
    public TeamMember createTeamMember(@RequestBody TeamMember teamMember) {
        return teamRepository.save(teamMember);
    }
}
