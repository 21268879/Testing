public class AdvertType {
    private double advertCopyrightCostsL = 750;
    private double advertCopyrightCostsH = 1500.0;
    private double advertSpaceCostTV = 1800;
    private double advertSpaceCostR = 900;

    public double calculateWeb() {
        return advertCopyrightCostsH;
    }

    public double calculateEmail() {
        return advertCopyrightCostsL;
    }

    public double calculateTV(long prHours) {
        PurchasingStaff testPurchasingStaff = new PurchasingStaff();
        testPurchasingStaff.setMemberPaycheck(prHours);
        double tvAd = advertCopyrightCostsH + advertSpaceCostTV + testPurchasingStaff.getMemberPay();
        return tvAd;
    }

    public double calculateRadio(long prHours) {
        PurchasingStaff testPurchasingStaff = new PurchasingStaff();
        testPurchasingStaff.setMemberPaycheck(prHours);
        double radioAd = advertSpaceCostR + advertCopyrightCostsL + testPurchasingStaff.getMemberPay();
        return radioAd;
    }

    public double calculateNewspaper() {
        double newspaperAd = advertCopyrightCostsL;
        return newspaperAd;
    }

    public double calculateMagasine() {
        double magasineAd = advertCopyrightCostsH;
        return magasineAd;
    }
}