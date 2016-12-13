/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OversiktKlasser;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import java.util.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.lang.*;

/**
 *
 * @author maria
 */
public class CombineOversikt {
    
    final ObservableList<StudentOversikt> studentData = FXCollections.observableArrayList(
            new StudentOversikt(1, "Per Olsen", "polsen@online.no"), 
            new StudentOversikt(2, "Ole Olsen", "oolsen@online.no"),
            new StudentOversikt(3, "Per Ulv", "pulv@gmail.com"),
            new StudentOversikt(4, "Nils Hansen", "Modul 2"),
            new StudentOversikt(5, "Torbjørn Hovstad", "Modul 2"),
            new StudentOversikt(6, "Hans Nilsen", "Modul 3")
    );
    
    final ObservableList<BesvarelseOversikt> besvarelseData = FXCollections.observableArrayList(
            new BesvarelseOversikt(1, 1, "30.04.2016"), 
            new BesvarelseOversikt(2, 1, "24.05.2016"),
            new BesvarelseOversikt(3, 1, "pulv@gmail.com"),
            new BesvarelseOversikt(4, 1, "Modul 2"),
            new BesvarelseOversikt(5, 1, "Modul 2"),
            new BesvarelseOversikt(6, 1, "Modul 3")
    );
    
    final ObservableList<TilbakemeldingOversikt> tilbakemeldingData = FXCollections.observableArrayList(
            new TilbakemeldingOversikt(1, 1, 3, "30.04.2016"), 
            new TilbakemeldingOversikt(1, 2, 2, "30.04.2016"), 
            new TilbakemeldingOversikt(1, 2, 2, "30.04.2016"), 
            new TilbakemeldingOversikt(1, 3, 3, "30.04.2016"), 
            new TilbakemeldingOversikt(1, 3, 3, "30.04.2016"), 
            new TilbakemeldingOversikt(1, 4, 3, "30.04.2016"), 
            new TilbakemeldingOversikt(1, 5, 3, "30.04.2016") 
    );
    
    
    /*
    HashMap<Integer, List<BesvarelseOversikt>> hm = new HashMap<Integer, List<BesvarelseOversikt>>();
    for(BesvarelseOversikt bo : besvarelseData) {
        hm.add(bo.getOversiktBesvarelseID());
    }
    //hs contains all the ids of list2
    List<StudentOversikt> result = new ArrayList<StudentOversikt>();
    for(StudentOversikt so : studentData) {
        if(hm.contains(so.getOversiktStudentID()))
            result.add(so);
    }
}*/
}
