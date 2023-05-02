package med.voll.api.patient;

import med.voll.api.address.Address;

public record PatientRegistration(String name, String email, String phone, String cpf, Address address) {
}
