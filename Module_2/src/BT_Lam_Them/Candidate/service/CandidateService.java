package BT_Lam_Them.Candidate.service;

import BT_Lam_Them.Candidate.model.Candidate;

public interface CandidateService {
    void add(Candidate candidate);
    Candidate[] findAll();
}
