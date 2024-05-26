package com.example.prak6_13120220012;

import org.json.JSONException;
import org.json.JSONObject;

public class Mahasiswa {
    private String stb;
    private String nama;
    private int angkatan;

    private JSONObject jsonobject;
    private Mahasiswa mhs;

    public Mahasiswa(String stb, String nama, int angkatan){
        this.stb = stb;
        this.nama = nama;
        this.angkatan = angkatan;
    }

    public String getStb() {
        return stb;
    }

    public String getNama() {
        return nama;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public JSONObject toJSON() throws JSONException {
        jsonobject = new JSONObject();
        jsonobject.put("stb", stb);
        jsonobject.put("nama", nama);
        jsonobject.put("angkatan", angkatan);
        return jsonobject;
    }
}
