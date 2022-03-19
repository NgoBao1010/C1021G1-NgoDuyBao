package BT_Lam_Them.Candidate.service.impl;

import BT_Lam_Them.Candidate.model.Candidate;
import BT_Lam_Them.Candidate.service.CandidateService;

public class CandidateServiceImpl implements CandidateService {

    private static Candidate[] candidateList = new Candidate[1];
    static {
        candidateList[0] = new Candidate(1,"Bảo","10/10/1995",5.0,9.0,8.5);
    }

    @Override
    public void add(Candidate candidate) {
        Candidate[] newList = new Candidate[candidateList.length + 1];
        newList[newList.length - 1] = candidate;
        for(int index = 0; index < candidateList.length; index++){
                newList[index] = candidateList[index];
        }
        candidateList = newList;
    }

    @Override
    public Candidate[] findAll() {
        return candidateList;
    }

}
