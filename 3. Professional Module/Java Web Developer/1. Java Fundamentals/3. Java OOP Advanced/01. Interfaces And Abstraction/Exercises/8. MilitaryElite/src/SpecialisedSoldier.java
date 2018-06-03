public abstract class SpecialisedSoldier extends Private implements ISpecialisedSoldier {

    private String corps;

    public SpecialisedSoldier(String id, String firstName, String lastName, Double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }

    private void setCorps(String corps) {

        switch (corps) {
            case ISpecialisedSoldier.CORPS_AIRFORCES:
            case ISpecialisedSoldier.CORPS_MARINES:
                this.corps = corps;
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public String getCorps() {
        return this.corps;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder(super.toString());
        b.append(System.lineSeparator());

        b.append("Corps: ").append(this.getCorps())
                .append(System.lineSeparator());

        return b.toString().trim();
    }
}