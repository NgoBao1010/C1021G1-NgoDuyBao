package com.codegym.case_study_spring.model.contract;

public class ContractDetail {
    private String idContractDetail;
    private String attachService;
    private int quantity;
    private int idContract;


    public ContractDetail() {
    }

    public ContractDetail(String idContractDetail, String attachService, int quantity) {
        this.idContractDetail = idContractDetail;
        this.attachService = attachService;
        this.quantity = quantity;
    }

    public ContractDetail(String idContractDetail, String attachService, int quantity, int idContract) {
        this.idContractDetail = idContractDetail;
        this.attachService = attachService;
        this.quantity = quantity;
        this.idContract = idContract;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public String getIdContractDetail() {
        return idContractDetail;
    }

    public void setIdContractDetail(String idContractDetail) {
        this.idContractDetail = idContractDetail;
    }

    public String getAttachService() {
        return attachService;
    }

    public void setAttachService(String attachService) {
        this.attachService = attachService;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
