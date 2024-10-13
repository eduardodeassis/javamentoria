package org.example;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    String nome;
    List<Float> notas = new ArrayList<>();

    public float total() {
        float tmp = 0f;
        for (Float value : notas) {
            tmp += value;
        }
        return tmp;
    }

    public float media() {
        float tmp = total();
        return tmp / notas.size();
    }

}
