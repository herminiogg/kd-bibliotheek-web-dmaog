package eu.kazernedossin.bibliotheekweb.dao;

import com.herminiogarcia.dmaog.common.IRIValue;
import java.util.List;

public class DcText {

    public final static String rdfType = "http://purl.org/dc/elements/1.1/Text";
    public final static String subjectPrefix = "http://bibliotheek.kazernedossin.eu/books/";

    private IRIValue dcLanguage;
    private String lent;
    private Integer dcSizeOrDuration;
    private Boolean missing;
    private String dcHasVersion;
    private String dcPublisher;
    private String dcSubject;
    private String lendingDate;
    private String dcTitle;
    private String info;
    private Boolean cdrom;
    private String donatedBy;
    private String schemaLocationCreated;
    private IRIValue dcCreated;
    private String dcCreator;
    private String dcIdentifier;
    private IRIValue id;

    public DcText() {

    }

    public IRIValue getDcLanguage() {
        return this.dcLanguage;
    }

    public String getLent() {
        return this.lent;
    }

    public Integer getDcSizeOrDuration() {
        return this.dcSizeOrDuration;
    }

    public Boolean getMissing() {
        return this.missing;
    }

    public String getDcHasVersion() {
        return this.dcHasVersion;
    }

    public String getDcPublisher() {
        return this.dcPublisher;
    }

    public String getDcSubject() {
        return this.dcSubject;
    }

    public String getLendingDate() {
        return this.lendingDate;
    }

    public String getDcTitle() {
        return this.dcTitle;
    }

    public String getInfo() {
        return this.info;
    }

    public Boolean getCdrom() {
        return this.cdrom;
    }

    public String getDonatedBy() {
        return this.donatedBy;
    }

    public String getSchemaLocationCreated() {
        return this.schemaLocationCreated;
    }

    public IRIValue getDcCreated() {
        return this.dcCreated;
    }

    public String getDcCreator() {
        return this.dcCreator;
    }

    public String getDcIdentifier() {
        return this.dcIdentifier;
    }

    public IRIValue getId() {
        return this.id;
    }


    public DcText setDcLanguage(IRIValue dcLanguage) {
        this.dcLanguage = dcLanguage;
        return this;
    }

    public DcText setLent(String lent) {
        this.lent = lent;
        return this;
    }

    public DcText setDcSizeOrDuration(Integer dcSizeOrDuration) {
        this.dcSizeOrDuration = dcSizeOrDuration;
        return this;
    }

    public DcText setMissing(Boolean missing) {
        this.missing = missing;
        return this;
    }

    public DcText setDcHasVersion(String dcHasVersion) {
        this.dcHasVersion = dcHasVersion;
        return this;
    }

    public DcText setDcPublisher(String dcPublisher) {
        this.dcPublisher = dcPublisher;
        return this;
    }

    public DcText setDcSubject(String dcSubject) {
        this.dcSubject = dcSubject;
        return this;
    }

    public DcText setLendingDate(String lendingDate) {
        this.lendingDate = lendingDate;
        return this;
    }

    public DcText setDcTitle(String dcTitle) {
        this.dcTitle = dcTitle;
        return this;
    }

    public DcText setInfo(String info) {
        this.info = info;
        return this;
    }

    public DcText setCdrom(Boolean cdrom) {
        this.cdrom = cdrom;
        return this;
    }

    public DcText setDonatedBy(String donatedBy) {
        this.donatedBy = donatedBy;
        return this;
    }

    public DcText setSchemaLocationCreated(String schemaLocationCreated) {
        this.schemaLocationCreated = schemaLocationCreated;
        return this;
    }

    public DcText setDcCreated(IRIValue dcCreated) {
        this.dcCreated = dcCreated;
        return this;
    }

    public DcText setDcCreator(String dcCreator) {
        this.dcCreator = dcCreator;
        return this;
    }

    public DcText setDcIdentifier(String dcIdentifier) {
        this.dcIdentifier = dcIdentifier;
        return this;
    }

    public DcText setId(IRIValue id) {
        this.id = id;
        return this;
    }


}