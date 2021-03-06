package com.njucm.cmdh.app.domain;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table PHYSIQUE_INFO.
 */
public class PhysiqueInfo {

    private Long id;
    private Integer physiqueinfoid;
    private Double tablescoreheight;
    private Double tablescorelow;
    private Double switchscoreheight;
    private Double switchscorelow;
    private String generacharacter;
    private String shapefeature;
    private String commonmanifest;
    private String mentalcharacter;
    private String incidencetendency;
    private String adaptivecapacity;
    private String physicaltypename;
    private Integer physicaltypecode;
    private String adjustmethod;
    private String multiplepeople;
    private String physicalinterpretation;
    private String physicalreason;
    private String physicaladjustmethod;
    private String foodallowtaboo;
    public PhysiqueInfo() {
    }

    public PhysiqueInfo(Long id) {
        this.id = id;
    }

    public PhysiqueInfo(Long id, Integer physiqueinfoid, Double tablescoreheight, Double tablescorelow, Double switchscoreheight, Double switchscorelow, String generacharacter, String shapefeature, String commonmanifest, String mentalcharacter, String incidencetendency, String adaptivecapacity, String physicaltypename, Integer physicaltypecode,String multiplepeople,String adjustmethod,String physicalinterpretation,String physicalreason,String physicaladjustmethod,String foodallowtaboo) {
        this.id = id;
        this.physiqueinfoid = physiqueinfoid;
        this.tablescoreheight = tablescoreheight;
        this.tablescorelow = tablescorelow;
        this.switchscoreheight = switchscoreheight;
        this.switchscorelow = switchscorelow;
        this.generacharacter = generacharacter;
        this.shapefeature = shapefeature;
        this.commonmanifest = commonmanifest;
        this.mentalcharacter = mentalcharacter;
        this.incidencetendency = incidencetendency;
        this.adaptivecapacity = adaptivecapacity;
        this.physicaltypename = physicaltypename;
        this.physicaltypecode = physicaltypecode;
        this.adjustmethod= adjustmethod;
        this.multiplepeople =multiplepeople;
        this.physicalinterpretation = physicalinterpretation;
        this.physicalreason = physicalreason;
        this.physicaladjustmethod = physicaladjustmethod;
        this.foodallowtaboo = foodallowtaboo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPhysiqueinfoid() {
        return physiqueinfoid;
    }

    public void setPhysiqueinfoid(Integer physiqueinfoid) {
        this.physiqueinfoid = physiqueinfoid;
    }

    public Double getTablescoreheight() {
        return tablescoreheight;
    }

    public void setTablescoreheight(Double tablescoreheight) {
        this.tablescoreheight = tablescoreheight;
    }

    public Double getTablescorelow() {
        return tablescorelow;
    }

    public void setTablescorelow(Double tablescorelow) {
        this.tablescorelow = tablescorelow;
    }

    public Double getSwitchscoreheight() {
        return switchscoreheight;
    }

    public void setSwitchscoreheight(Double switchscoreheight) {
        this.switchscoreheight = switchscoreheight;
    }

    public Double getSwitchscorelow() {
        return switchscorelow;
    }

    public void setSwitchscorelow(Double switchscorelow) {
        this.switchscorelow = switchscorelow;
    }

    public String getGeneracharacter() {
        return generacharacter;
    }

    public void setGeneracharacter(String generacharacter) {
        this.generacharacter = generacharacter;
    }

    public String getShapefeature() {
        return shapefeature;
    }

    public void setShapefeature(String ShapeFeature) {
        this.shapefeature = ShapeFeature;
    }

    public String getCommonmanifest() {
        return commonmanifest;
    }

    public void setCommonmanifest(String commonmanifest) {
        this.commonmanifest = commonmanifest;
    }

    public String getMentalcharacter() {
        return mentalcharacter;
    }

    public void setMentalcharacter(String mentalcharacter) {
        this.mentalcharacter = mentalcharacter;
    }

    public String getIncidencetendency() {
        return incidencetendency;
    }

    public void setIncidencetendency(String incidencetendency) {
        this.incidencetendency = incidencetendency;
    }

    public String getAdaptivecapacity() {
        return adaptivecapacity;
    }

    public void setAdaptivecapacity(String adaptivecapacity) {
        this.adaptivecapacity = adaptivecapacity;
    }

    public String getPhysicaltypename() {
        return physicaltypename;
    }

    public void setPhysicaltypename(String physicaltypename) {
        this.physicaltypename = physicaltypename;
    }

    public Integer getPhysicaltypecode() {
        return physicaltypecode;
    }

    public void setPhysicaltypecode(Integer physicaltypecode) {
        this.physicaltypecode = physicaltypecode;
    }
    public String getAdjustmethod(){
        return adjustmethod;
    }
    public void setAdjustmethod(String adjustmethod){
        this.adjustmethod = adjustmethod;
    }
    public String getPhysicalinterpretation(){
        return physicalinterpretation;
    }
    public void setPhysicalinterpretation(String physicalinterpretation){
        this.physicalinterpretation = physicalinterpretation;
    }
    public String getPhysicalreason(){
        return  physicalreason;
    }
    public void setPhysicalreason(String physicalreason){
        this.physicalreason = physicalreason;
    }
    public String getPhysicaladjustmethod(){
        return physicaladjustmethod;
    }
    public void setPhysicaladjustmethod(String physicaladjustmethod){
        this.physicaladjustmethod = physicaladjustmethod;
    }
    public String getFoodallowtaboo(){
        return foodallowtaboo;
    }
    public void setFoodallowtaboo(String foodallowtaboo){
        this.foodallowtaboo = foodallowtaboo;
    }
    public String getMultiplepeople(){
        return multiplepeople;
    }
    public void setMultiplepeople(String multiplepeople){
        this.multiplepeople = multiplepeople;
    }
}

