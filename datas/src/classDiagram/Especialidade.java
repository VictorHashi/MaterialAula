/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classDiagram;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author covid
 */
public class Especialidade {
    
    private String descricao;
    
    private List<Medico> medicos = new ArrayList<Medico>();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }

    @Override
    public String toString() {
        return "Especialidade{" + "descricao=" + descricao + ", medicos=" + medicos + '}';
    }
    
    
}
