/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorbuoi1.repository;

import java.util.ArrayList;
import tutorbuoi1.modal.SinhVienModal;

/**
 *
 * @author redstar
 */
public class SinhViemRepository {

    ArrayList<SinhVienModal> listSV = new ArrayList<>();

    public SinhViemRepository() {
        listSV.add(new SinhVienModal("SV1", "Phanh", 6.0, "Cntt"));
        listSV.add(new SinhVienModal("SV2", "Hung", 6.0, "Cntt"));
        listSV.add(new SinhVienModal("SV3", "Huy", 6.0, "Cntt"));
        listSV.add(new SinhVienModal("SV4", "Sang", 6.0, "Cntt"));
    }

    public ArrayList<SinhVienModal> getAll() {
        return listSV;
    }
    public void Them(SinhVienModal sv1){
        listSV.add(sv1);
    }

}
