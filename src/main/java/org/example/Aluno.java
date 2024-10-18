package org.example;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    String nome;
    List<Float> notas = new ArrayList<>();

    public float total() {
        float tmp = 0f;

        if (notas.size() > 0) {
            for (Float value : notas) {
                tmp += value;
            }
            return tmp;
        }else{
            return 0;
        }
    }

    public float media() {
        if (notas.size() > 0) {
            float tmp = total();
            return tmp / notas.size();
        } else {
            return 0;
        }
    }



}
