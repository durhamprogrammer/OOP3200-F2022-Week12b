module ca.durhamcollege.oop3200f2022week12b {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.durhamcollege.oop3200f2022week12b to javafx.fxml;
    exports ca.durhamcollege.oop3200f2022week12b;
    exports ca.durhamcollege.oop3200f2022week12b.core;
    opens ca.durhamcollege.oop3200f2022week12b.core to javafx.fxml;
    exports ca.durhamcollege.oop3200f2022week12b.objects;
    opens ca.durhamcollege.oop3200f2022week12b.objects to javafx.fxml;
    exports ca.durhamcollege.oop3200f2022week12b.Controllers;
    opens ca.durhamcollege.oop3200f2022week12b.Controllers to javafx.fxml;
    exports ca.durhamcollege.oop3200f2022week12b.Managers;
    opens ca.durhamcollege.oop3200f2022week12b.Managers to javafx.fxml;
}