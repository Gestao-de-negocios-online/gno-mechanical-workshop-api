package br.com.gotech.gno_mechanical_workshop_api.gno_mechanical_workshop_api.enuns;

public enum VehicleType {
    CAR(1, "Carro"),
    MOTORCYCLE(2, "Moto"),
    TRUCK(3, "Caminhão");

    private final int code;
    private final String description;

    VehicleType(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static VehicleType fromCode(int code) {
        for (VehicleType type : VehicleType.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("Código de tipo de veículo inválido: " + code);
    }
}
