package com.example.system;

import java.net.URL;
import java.time.LocalDate;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.input.KeyEvent;

public class HelloController extends TextField {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Label ALGO2LAble;

        @FXML
        private Label ANALYSE2LABLE;

        @FXML
        private Label ANAlyse3Lable;

        @FXML
        private Label ANalyseLable;

        @FXML
        private Button AddButton;

        @FXML
        private TableView<Student> AddStudentTableView;

        @FXML
        private AnchorPane AddStudntPagePane;

        @FXML
        private Button Add_StudentButton;

        @FXML
        private Label Algebra3LAble;

        @FXML
        private Label Algebre2lable;

        @FXML
        private Label AlgebreLable;

        @FXML
        private Label Algo1LAble;

        @FXML
        private Label Algo3LAble;

        @FXML
        private Label Arch1LAble;

        @FXML
        private Label Arch2lable;

        @FXML
        private Label BDDLABLE;

        @FXML
        private Label BeruLable;

        @FXML
        private TableColumn<String, String> BirthdayCOLT;

        @FXML
        private BorderPane BorderPAne;

        @FXML
        private Button CalculeButton1;

        @FXML
        private Button CalculeButton2;

        @FXML
        private Button CalculeButton3;

        @FXML
        private Button CalculeButton4;

        @FXML
        private DatePicker DatePicker;

        @FXML
        private Button DeleteButton;

        @FXML
        private AnchorPane DissplayPane;

        @FXML
        private TextField EnglaisExamTextF2;

        @FXML
        private Label EnglaisLable;

        @FXML
        private Label EnglishLable;

        @FXML
        private Label EnglishLable2;

        @FXML
        private Label EntrpronariaLable;

        @FXML
        private TextField EntrpronariaTextFeild;

        @FXML
        private TextField ExamALgebre2TExtF;

        @FXML
        private TextField ExamARCH1TEXTF;

        @FXML
        private TextField ExamAlgebreTEXTF;

        @FXML
        private TextField ExamAlgo2TextF;

        @FXML
        private TextField ExamAnalyse2TextF;

        @FXML
        private TextField ExamBDDTextF;

        @FXML
        private TextField ExamBeruTextF;

        @FXML
        private TextField ExamEnglais2TextF;

        @FXML
        private TextField ExamGraphTextF;

        @FXML
        private Label ExamLable2;

        @FXML
        private TextField ExamLogiqueTextF;

        @FXML
        private TextField ExamNetworTextF;

        @FXML
        private TextField ExamProba2TextF;

        @FXML
        private TextField ExamSYSTEMEXPTEXTF;

        @FXML
        private TextField ExamSystemEXp2TextF;

        @FXML
        private Label Examen3Lable;

        @FXML
        private TextField ExamenALgo3TextF;

        @FXML
        private TextField ExamenARCH2TextFeild;

        @FXML
        private TextField ExamenAlgo1TextF;

        @FXML
        private TextField ExamenAnalyse1TExtF;

        @FXML
        private TextField ExamenAnalyse3TextFeild;

        @FXML
        private TextField ExamenEnglishTEXTF1;

        @FXML
        private Label ExamenLable4;

        @FXML
        private TextField ExamenOOP2TEXTF;

        @FXML
        private TextField ExamenProba3TextFeild;

        @FXML
        private TextField ExamenSystemINFtextF;

        @FXML
        private TableColumn<String, String> FNameCOLT;

        @FXML
        private Button FSemestreButton21;

        @FXML
        private Button FSemestreButton22;

        @FXML
        private Button FYearsButton;

        @FXML
        private Button FifYearsButton;

        @FXML
        private TextField FileExamenTextFeild;

        @FXML
        private Label FileLAble;

        @FXML
        private Button FyearButton;

        @FXML
        private ComboBox <String> GEndreComboBox;

        @FXML
        private TableColumn<String, Integer> GendreCOLT;

        @FXML
        private Label GendreLable;

        @FXML
        private TextField GradesTextFeild;

        @FXML
        private Label GraphLable;

        @FXML
        private ImageView IconsApp;

        @FXML
        private TableColumn<String, String> LNameCOLT;

        @FXML
        private ImageView LOGOPERSSON;

        @FXML
        private Button LSemestreButton21;

        @FXML
        private Button LSemestreButton22;

        @FXML
        private Label LabelYear;

        @FXML
        private Label Label_StudentID;

        @FXML
        private Label LableBirday;

        @FXML
        private Label LableFirstName;

        @FXML
        private Label LableLastName;

        @FXML
        private Label Lable_1;

        @FXML
        private Label LogiqueLable;

        @FXML
        private AnchorPane MAINPANE;

        @FXML
        private Button MoyenCalculatorButton;

        @FXML
        private AnchorPane MoyenCalculatorPane;

        @FXML
        private TextField MoyenTExtF1;

        @FXML
        private TextField MoyenTextF2;

        @FXML
        private TextField MoyenTextF4;

        @FXML
        private TextField MoyenTextFeild3;

        @FXML
        private Label NetworkLblle;

        @FXML
        private TextField OOP1EXAMtextFeild;

        @FXML
        private Label OOP1Lable;

        @FXML
        private TextField OOP1TPtextFeild;

        @FXML
        private Label OOP2Lanle;

        @FXML
        private Label Proba1Lable;

        @FXML
        private Label Proba3lable;

        @FXML
        private AnchorPane RightPane;

        @FXML
        private Label SYSEXPlable;

        @FXML
        private Button SYearsButton;

        @FXML
        private ImageView SearchIcons;

        @FXML
        private AnchorPane Semestre1year1ModulePanel;

        @FXML
        private AnchorPane Semestre1year2ModulePanel;

        @FXML
        private AnchorPane Semestre2year1ModulePanel;

        @FXML
        private AnchorPane Semestre2year2ModulePanel;

        @FXML
        private AnchorPane SemestrePane;

        @FXML
        private AnchorPane SemestrePane2;

        @FXML
        private StackPane StacPane;

        @FXML
        private TableColumn<String, Integer> StatusCOLT;

        @FXML
        private Label StatusLabel;

        @FXML
        private TableColumn<String, String> StudentIdCOLT;

        @FXML
        private Label SysInfLabel;

        @FXML
        private Label SystemEXP2lable;

        @FXML
        private Label TD3lable;

        @FXML
        private TextField TDALgebre2TExtF;

        @FXML
        private TextField TDALgebre3TextFeild;

        @FXML
        private TextField TDALgo3TextF;

        @FXML
        private TextField TDARCH1TEXTF;

        @FXML
        private TextField TDARCH2TF;

        @FXML
        private TextField TDAlgebreTEXTF;

        @FXML
        private TextField TDAlgo1TextF;

        @FXML
        private TextField TDAlgo2TextF;

        @FXML
        private TextField TDAnalyse1TExtF;

        @FXML
        private TextField TDAnalyse2TextF;

        @FXML
        private TextField TDAnalyse3TextFeild;

        @FXML
        private TextField TDBDDTextF;

        @FXML
        private TextField TDGraphTextF;

        @FXML
        private Label TDLable2;

        @FXML
        private Label TDLable4;

        @FXML
        private TextField TDLogiqueTextF;

        @FXML
        private TextField TDNetworTextF;

        @FXML
        private TextField TDProba2TextF;

        @FXML
        private TextField TDProba3TF;

        @FXML
        private TextField TDSYSTEMEXPTEXTF;

        @FXML
        private TextField TDSystemEXp2TextF;

        @FXML
        private TextField TDSystemINFTextF;

        @FXML
        private Button THYearsButton;

        @FXML
        private AnchorPane TOpBarPAne;

        @FXML
        private TextField TPAlgo1TextF;

        @FXML
        private TextField TPAlgo2TextF;

        @FXML
        private TextField TPBeruTextF;

        @FXML
        private TextField TPFileTextFeild;

        @FXML
        private TextField TPNetworkTextF;

        @FXML
        private TextField TPOOP2TextF;

        @FXML
        private TextField TPSYSTEMEXPTEXTF;

        @FXML
        private TextField TPSystemEXp2TextF;

        @FXML
        private TextField TextFeildFirstName;

        @FXML
        private TextField TextFeildLastName;

        @FXML
        private TextField TextFiealdSearch;

        @FXML
        private TextField TextFiledStudentID;

        @FXML
        private Label Tp3lable;

        @FXML
        private Label TpLable2;

        @FXML
        private Label TpLable4;

        @FXML
        private Label ProjectLable1;

        @FXML
        private TextField ExamLangagueTextF1;

        @FXML
        private TextField TDLangagueTextF1;

        @FXML
        private TextField ProjectExamTextF21;

        @FXML
        private TableColumn<String, Integer> YearCOLT;

        @FXML
        private ComboBox<String> YearComboBox;

        @FXML
        private AnchorPane principalePane;

        @FXML
        private Label langageLblle1;
        @FXML
        private Label welcomLabel;

        @FXML
        void ONStatusCHoseCheckBOX(ActionEvent event) {

        }
        @FXML
        private TextField ExamenAlgebre5;
        @FXML
        void ONYears1CHoseCheckBOX(ActionEvent event) {

        }

        @FXML
        void OnADDButton1(ActionEvent event) {
                 String studentId = TextFiledStudentID.getText();
                 String year = YearComboBox.getSelectionModel().getSelectedItem();
                 String firstName = TextFeildFirstName.getText();
                 String lastName = TextFeildLastName.getText();
                 String gendre = GEndreComboBox.getSelectionModel().getSelectedItem();
                 String Grade = GradesTextFeild.getText();
                 LocalDate birthday = DatePicker.getValue() ;
                if (studentId!=null && !year.isEmpty()&& firstName!=null && !lastName.isEmpty()&& !gendre.isEmpty()&& birthday!=null && !Grade.isEmpty()) {
                        try {
                                int studentIdd = Integer.parseInt(studentId);
                                int yearr = Integer.parseInt(year);
                                double Gradee = Double.parseDouble(Grade);
                                students.add(new Student(studentIdd, yearr, firstName, lastName, gendre, birthday, Gradee));
                                // ... (clear text fields)
                        } catch (NumberFormatException e) {
                                // Handle invalid student ID
                        }
                }
        }

        @FXML
        void OncloseButton(ActionEvent event) {
                System.exit(0);
        }

        @FXML
        void Onminimize(ActionEvent event) {
                Stage st = (Stage)MAINPANE.getScene().getWindow();
                st.setIconified(true);
        }

        @FXML
        void OnDeleteButton1(ActionEvent event) {

        }

        @FXML
        void OnSearchTextF(ActionEvent event) {

        }
        @FXML
        private TextField gradeTextField;

        @FXML
        void handleNumberInput (KeyEvent event){
                KeyCode key = event.getCode();
                if (!key.isDigitKey() && key != KeyCode.MINUS) {
                        event.consume(); // Prevent invalid characters
                }
        }


        @FXML
        void onCalculeButton4(){
        }

        @FXML
        void switchForm(ActionEvent event) {
                if(event.getSource()==Add_StudentButton){
                        principalePane.setVisible(false);
                        AddStudntPagePane.setVisible(true);
                        MoyenCalculatorPane.setVisible(false);


                }else if(event.getSource()==MoyenCalculatorButton){
                        principalePane.setVisible(false);
                        AddStudntPagePane.setVisible(false);
                        MoyenCalculatorPane.setVisible(true);
                }

        }

        @FXML
        void switchFormYears(ActionEvent event) {
                if(event.getSource()==FyearButton){
                        SemestrePane.setVisible(false);
                        SemestrePane2.setVisible(true);
                }else if(event.getSource()==SYearsButton){
                        SemestrePane.setVisible(true);
                        SemestrePane2.setVisible(false);
                }
        }

        @FXML
        void switchFormYearsSemestre(ActionEvent event) {
                if(event.getSource()==FSemestreButton21){
                        Semestre1year1ModulePanel.setVisible(true);
                        Semestre2year1ModulePanel.setVisible(false);
                }else if(event.getSource()==LSemestreButton21){
                        Semestre1year1ModulePanel.setVisible(false);
                        Semestre2year1ModulePanel.setVisible(true);
                }
        }


        @FXML
        void switchFormYearsSemestre3(ActionEvent event) {
                if(event.getSource()==FSemestreButton22){
                        Semestre1year2ModulePanel.setVisible(true);
                        Semestre2year2ModulePanel.setVisible(false);
                }else if(event.getSource()==LSemestreButton22){
                        Semestre1year2ModulePanel.setVisible(false);
                        Semestre2year2ModulePanel.setVisible(true);
                }
        }

        @FXML
        void Alert(ActionEvent event){
                if(event.getSource()==THYearsButton || event.getSource()==FYearsButton || event.getSource()==FifYearsButton){
                        Alert alert = new Alert(Alert.AlertType.WARNING);
                        alert.setTitle("WARNING");
                        alert.setHeaderText(null);
                        alert.setContentText("INFORMATION NOT AVAILABLE");
                        Optional<ButtonType> option = alert.showAndWait();

                }
        }

        @FXML
        void onCalculeButton1 (ActionEvent event){

        }


        private ObservableList<Student> students;
        @FXML
        void initialize() {


                StudentIdCOLT.setCellValueFactory(new PropertyValueFactory<>("ID"));
                YearCOLT.setCellValueFactory(new PropertyValueFactory<>("Year"));
                FNameCOLT.setCellValueFactory(new PropertyValueFactory<>("FirsName"));
                LNameCOLT.setCellValueFactory(new PropertyValueFactory<>("LastName"));
                GendreCOLT.setCellValueFactory(new PropertyValueFactory<>("gendre"));
                BirthdayCOLT.setCellValueFactory(new PropertyValueFactory<>("birthday"));
                StatusCOLT.setCellValueFactory(new PropertyValueFactory<>("Grade"));
                students= FXCollections.observableArrayList();
                AddStudentTableView.setItems(students);




                ObservableList<String> options = FXCollections.observableArrayList(
                        "1", "2", "3"
                );
                YearComboBox.setItems(options);
                YearComboBox.setPromptText("year");

                ObservableList<String> ts = FXCollections.observableArrayList(
                        "M", "F"
                );
                GEndreComboBox.setItems(ts);
                GEndreComboBox.setPromptText("Gendre");


                TextFiledStudentID.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*")) {
                                return change;
                        }
                        return null;
                }));

                GradesTextFeild.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));

                ExamenOOP2TEXTF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TPOOP2TextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));


                ExamenSystemINFtextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TDSystemINFTextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));


                ExamBDDTextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TDBDDTextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));


                ExamGraphTextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TDGraphTextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));


                ExamNetworTextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TDNetworTextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TPNetworkTextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));

                ProjectExamTextF21.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));

                ExamLangagueTextF1.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TDLangagueTextF1.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));


                EnglaisExamTextF2.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));



                CalculeButton4.setOnAction(event -> {
                        try {
                                double sum = ((Double.parseDouble(ExamenOOP2TEXTF.getText())*0.6 +
                                        Double.parseDouble(TPOOP2TextF.getText())*0.4)*6 +

                                        (Double.parseDouble(ExamenSystemINFtextF.getText())*0.6+
                                        Double.parseDouble(TDSystemINFTextF.getText())*0.4)*3+

                                        (Double.parseDouble(ExamBDDTextF.getText())*0.6+
                                        Double.parseDouble(TDBDDTextF.getText())*0.4)*3+

                                        (Double.parseDouble(ExamGraphTextF.getText())*0.6+
                                        Double.parseDouble(TDGraphTextF.getText())*0.4)*3+

                                        (Double.parseDouble(ExamLangagueTextF1.getText())*0.6+
                                                Double.parseDouble(TDLangagueTextF1.getText())*0.4)*3+

                                        (Double.parseDouble(ExamNetworTextF.getText())*0.6+
                                        Double.parseDouble(TDNetworTextF.getText())*0.2+
                                        Double.parseDouble(TPNetworkTextF.getText())*0.2)*4+

                                        Double.parseDouble(ProjectExamTextF21.getText())*6+

                                        Double.parseDouble(EnglaisExamTextF2.getText())*1)/29;

                                MoyenTextF4.setText(String.format("%.2f", sum)); // Display result with 2 decimal places
                        } catch (NumberFormatException e) {
                                // Handle invalid input (e.g., non-numeric values)
                        }
                });







                OOP1EXAMtextFeild.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                OOP1TPtextFeild.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));


                FileExamenTextFeild.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TPFileTextFeild.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));


                ExamenAnalyse3TextFeild.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TDAnalyse3TextFeild.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));


                ExamenAlgebre5.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TDALgebre3TextFeild.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));


                ExamenProba3TextFeild.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TDProba3TF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));

                ExamenARCH2TextFeild.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TDARCH2TF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));

                ExamenALgo3TextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TDALgo3TextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));


                EntrpronariaTextFeild.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));






                CalculeButton3.setOnAction(event -> {
                        try {
                                double sum = ((Double.parseDouble(OOP1EXAMtextFeild.getText())*0.6 +
                                        Double.parseDouble(OOP1TPtextFeild.getText())*0.4)*5 +

                                        (Double.parseDouble(FileExamenTextFeild.getText())*0.6+
                                                Double.parseDouble(TPFileTextFeild.getText())*0.4)*5+

                                        (Double.parseDouble(ExamenAnalyse3TextFeild.getText())*0.6+
                                                Double.parseDouble(TDAnalyse3TextFeild.getText())*0.4)*4+

                                        (Double.parseDouble(ExamenAlgebre5.getText())*0.6+
                                                Double.parseDouble(TDALgebre3TextFeild.getText())*0.4)*4+

                                        (Double.parseDouble(ExamenProba3TextFeild.getText())*0.6+
                                                Double.parseDouble(TDProba3TF.getText())*0.4)*2+

                                        (Double.parseDouble(ExamenARCH2TextFeild.getText())*0.6+
                                                Double.parseDouble(TDARCH2TF.getText())*0.4)*5+

                                        (Double.parseDouble(ExamenALgo3TextF.getText())*0.6+
                                                Double.parseDouble(TDALgo3TextF.getText())*0.4)*4+

                                        Double.parseDouble(EntrpronariaTextFeild.getText())*1)/30;

                                MoyenTextFeild3.setText(String.format("%.2f", sum)); // Display result with 2 decimal places
                        } catch (NumberFormatException e) {
                                // Handle invalid input (e.g., non-numeric values)
                        }
                });



                ExamenAlgo1TextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TDAlgo1TextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TPAlgo1TextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));



                ExamenAnalyse1TExtF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TDAnalyse1TExtF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));


                ExamAlgebreTEXTF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TDAlgebreTEXTF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));


                ExamARCH1TEXTF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TDARCH1TEXTF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));


                ExamSYSTEMEXPTEXTF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TDSYSTEMEXPTEXTF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TPSYSTEMEXPTEXTF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));

                ExamBeruTextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TPBeruTextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));

                ExamenEnglishTEXTF1.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));



                CalculeButton1.setOnAction(event -> {
                        try {
                                double sum = ((Double.parseDouble(ExamenAlgo1TextF.getText())*0.6 +
                                        Double.parseDouble(TDAlgo1TextF.getText())*0.2+
                                        Double.parseDouble(TPAlgo1TextF.getText())*0.2)*6 +

                                        (Double.parseDouble(ExamenAnalyse1TExtF.getText())*0.6+
                                                Double.parseDouble(TDAnalyse1TExtF.getText())*0.4)*6+

                                        (Double.parseDouble(ExamAlgebreTEXTF.getText())*0.6+
                                                Double.parseDouble(TDAlgebreTEXTF.getText())*0.4)*4+

                                        (Double.parseDouble(ExamARCH1TEXTF.getText())*0.6+
                                                Double.parseDouble(TDARCH1TEXTF.getText())*0.4)*4+

                                        (Double.parseDouble(ExamSYSTEMEXPTEXTF.getText())*0.6+
                                                Double.parseDouble(TDSYSTEMEXPTEXTF.getText())*0.2+
                                                Double.parseDouble(TPSYSTEMEXPTEXTF.getText())*0.2)*4+

                                        (Double.parseDouble(ExamBeruTextF.getText())*0.6+
                                                Double.parseDouble(TPBeruTextF.getText())*0.4)*1+


                                        Double.parseDouble(ExamenEnglishTEXTF1.getText())*1)/26;

                                MoyenTExtF1.setText(String.format("%.2f", sum)); // Display result with 2 decimal places
                        } catch (NumberFormatException e) {
                                // Handle invalid input (e.g., non-numeric values)
                        }
                });












                ExamAlgo2TextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TDAlgo2TextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TPAlgo2TextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));



                ExamAnalyse2TextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TDAnalyse2TextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));


                ExamALgebre2TExtF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TDALgebre2TExtF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));


                ExamProba2TextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TDProba2TextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));


                ExamSystemEXp2TextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TDSystemEXp2TextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TPSystemEXp2TextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));

                ExamLogiqueTextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));
                TDLogiqueTextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));

                ExamEnglais2TextF.setTextFormatter(new TextFormatter<>(change -> {
                        String input = change.getText();
                        if (input.matches("\\d*\\.?\\d*")) {
                                return change;
                        }
                        return null;
                }));








                CalculeButton2.setOnAction(event -> {
                        try {
                                double sum = ((Double.parseDouble(ExamAlgo2TextF.getText())*0.6 +
                                        Double.parseDouble(TDAlgo2TextF.getText())*0.2+
                                        Double.parseDouble(TPAlgo2TextF.getText())*0.2)*6 +

                                        (Double.parseDouble(ExamAnalyse2TextF.getText())*0.6+
                                                Double.parseDouble(TDAnalyse2TextF.getText())*0.4)*6+

                                        (Double.parseDouble(ExamALgebre2TExtF.getText())*0.6+
                                                Double.parseDouble(TDALgebre2TExtF.getText())*0.4)*4+

                                        (Double.parseDouble(ExamProba2TextF.getText())*0.6+
                                                Double.parseDouble(TDProba2TextF.getText())*0.4)*4+

                                        (Double.parseDouble(ExamSystemEXp2TextF.getText())*0.6+
                                                Double.parseDouble(TDSystemEXp2TextF.getText())*0.2+
                                                Double.parseDouble(TPSystemEXp2TextF.getText())*0.2)*6+

                                        (Double.parseDouble(ExamLogiqueTextF.getText())*0.6+
                                                Double.parseDouble(TDLogiqueTextF.getText())*0.4)*4+


                                        Double.parseDouble(ExamEnglais2TextF.getText())*1)/31;

                                MoyenTExtF1.setText(String.format("%.2f", sum)); // Display result with 2 decimal places
                        } catch (NumberFormatException e) {
                                // Handle invalid input (e.g., non-numeric values)
                        }
                });

















                assert ALGO2LAble != null : "fx:id=\"ALGO2LAble\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ANALYSE2LABLE != null : "fx:id=\"ANALYSE2LABLE\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ANAlyse3Lable != null : "fx:id=\"ANAlyse3Lable\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ANalyseLable != null : "fx:id=\"ANalyseLable\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert AddButton != null : "fx:id=\"AddButton\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert AddStudentTableView != null : "fx:id=\"AddStudentTableView\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert AddStudntPagePane != null : "fx:id=\"AddStudntPagePane\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert Add_StudentButton != null : "fx:id=\"Add_StudentButton\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert Algebra3LAble != null : "fx:id=\"Algebra3LAble\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert Algebre2lable != null : "fx:id=\"Algebre2lable\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert AlgebreLable != null : "fx:id=\"AlgebreLable\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert Algo1LAble != null : "fx:id=\"Algo1LAble\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert Algo3LAble != null : "fx:id=\"Algo3LAble\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert Arch1LAble != null : "fx:id=\"Arch1LAble\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert Arch2lable != null : "fx:id=\"Arch2lable\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert BDDLABLE != null : "fx:id=\"BDDLABLE\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert BeruLable != null : "fx:id=\"BeruLable\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert BirthdayCOLT != null : "fx:id=\"BirthdayCOLT\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert BorderPAne != null : "fx:id=\"BorderPAne\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert CalculeButton1 != null : "fx:id=\"CalculeButton1\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert CalculeButton2 != null : "fx:id=\"CalculeButton2\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert CalculeButton3 != null : "fx:id=\"CalculeButton3\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert CalculeButton4 != null : "fx:id=\"CalculeButton4\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert DatePicker != null : "fx:id=\"DatePicker\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert DeleteButton != null : "fx:id=\"DeleteButton\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert DissplayPane != null : "fx:id=\"DissplayPane\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert EnglaisExamTextF2 != null : "fx:id=\"EnglaisExamTextF2\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert EnglaisLable != null : "fx:id=\"EnglaisLable\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert EnglishLable != null : "fx:id=\"EnglishLable\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert EnglishLable2 != null : "fx:id=\"EnglishLable2\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert EntrpronariaLable != null : "fx:id=\"EntrpronariaLable\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert EntrpronariaTextFeild != null : "fx:id=\"EntrpronariaTextFeild\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamALgebre2TExtF != null : "fx:id=\"ExamALgebre2TExtF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamARCH1TEXTF != null : "fx:id=\"ExamARCH1TEXTF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamAlgebreTEXTF != null : "fx:id=\"ExamAlgebreTEXTF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamAlgo2TextF != null : "fx:id=\"ExamAlgo2TextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamAnalyse2TextF != null : "fx:id=\"ExamAnalyse2TextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamBDDTextF != null : "fx:id=\"ExamBDDTextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamBeruTextF != null : "fx:id=\"ExamBeruTextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamEnglais2TextF != null : "fx:id=\"ExamEnglais2TextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamGraphTextF != null : "fx:id=\"ExamGraphTextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamLable2 != null : "fx:id=\"ExamLable2\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamLangagueTextF1 != null : "fx:id=\"ExamLangagueTextF1\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamLogiqueTextF != null : "fx:id=\"ExamLogiqueTextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamNetworTextF != null : "fx:id=\"ExamNetworTextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamProba2TextF != null : "fx:id=\"ExamProba2TextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamSYSTEMEXPTEXTF != null : "fx:id=\"ExamSYSTEMEXPTEXTF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamSystemEXp2TextF != null : "fx:id=\"ExamSystemEXp2TextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert Examen3Lable != null : "fx:id=\"Examen3Lable\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamenALgo3TextF != null : "fx:id=\"ExamenALgo3TextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamenARCH2TextFeild != null : "fx:id=\"ExamenARCH2TextFeild\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamenAlgebre5 != null : "fx:id=\"ExamenAlgebre5\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamenAlgo1TextF != null : "fx:id=\"ExamenAlgo1TextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamenAnalyse1TExtF != null : "fx:id=\"ExamenAnalyse1TExtF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamenAnalyse3TextFeild != null : "fx:id=\"ExamenAnalyse3TextFeild\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamenEnglishTEXTF1 != null : "fx:id=\"ExamenEnglishTEXTF1\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamenLable4 != null : "fx:id=\"ExamenLable4\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamenOOP2TEXTF != null : "fx:id=\"ExamenOOP2TEXTF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamenProba3TextFeild != null : "fx:id=\"ExamenProba3TextFeild\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ExamenSystemINFtextF != null : "fx:id=\"ExamenSystemINFtextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert FNameCOLT != null : "fx:id=\"FNameCOLT\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert FSemestreButton21 != null : "fx:id=\"FSemestreButton21\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert FSemestreButton22 != null : "fx:id=\"FSemestreButton22\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert FYearsButton != null : "fx:id=\"FYearsButton\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert FifYearsButton != null : "fx:id=\"FifYearsButton\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert FileExamenTextFeild != null : "fx:id=\"FileExamenTextFeild\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert FileLAble != null : "fx:id=\"FileLAble\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert FyearButton != null : "fx:id=\"FyearButton\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert GEndreComboBox != null : "fx:id=\"GEndreComboBox\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert GendreCOLT != null : "fx:id=\"GendreCOLT\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert GendreLable != null : "fx:id=\"GendreLable\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert GradesTextFeild != null : "fx:id=\"GradesTextFeild\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert GraphLable != null : "fx:id=\"GraphLable\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert IconsApp != null : "fx:id=\"IconsApp\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert LNameCOLT != null : "fx:id=\"LNameCOLT\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert LOGOPERSSON != null : "fx:id=\"LOGOPERSSON\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert LSemestreButton21 != null : "fx:id=\"LSemestreButton21\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert LSemestreButton22 != null : "fx:id=\"LSemestreButton22\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert LabelYear != null : "fx:id=\"LabelYear\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert Label_StudentID != null : "fx:id=\"Label_StudentID\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert LableBirday != null : "fx:id=\"LableBirday\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert LableFirstName != null : "fx:id=\"LableFirstName\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert LableLastName != null : "fx:id=\"LableLastName\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert Lable_1 != null : "fx:id=\"Lable_1\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert LogiqueLable != null : "fx:id=\"LogiqueLable\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert MAINPANE != null : "fx:id=\"MAINPANE\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert MoyenCalculatorButton != null : "fx:id=\"MoyenCalculatorButton\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert MoyenCalculatorPane != null : "fx:id=\"MoyenCalculatorPane\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert MoyenTExtF1 != null : "fx:id=\"MoyenTExtF1\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert MoyenTextF2 != null : "fx:id=\"MoyenTextF2\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert MoyenTextF4 != null : "fx:id=\"MoyenTextF4\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert MoyenTextFeild3 != null : "fx:id=\"MoyenTextFeild3\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert NetworkLblle != null : "fx:id=\"NetworkLblle\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert OOP1EXAMtextFeild != null : "fx:id=\"OOP1EXAMtextFeild\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert OOP1Lable != null : "fx:id=\"OOP1Lable\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert OOP1TPtextFeild != null : "fx:id=\"OOP1TPtextFeild\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert OOP2Lanle != null : "fx:id=\"OOP2Lanle\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert Proba1Lable != null : "fx:id=\"Proba1Lable\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert Proba3lable != null : "fx:id=\"Proba3lable\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ProjectExamTextF21 != null : "fx:id=\"ProjectExamTextF21\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert ProjectLable1 != null : "fx:id=\"ProjectLable1\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert RightPane != null : "fx:id=\"RightPane\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert SYSEXPlable != null : "fx:id=\"SYSEXPlable\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert SYearsButton != null : "fx:id=\"SYearsButton\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert SearchIcons != null : "fx:id=\"SearchIcons\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert Semestre1year1ModulePanel != null : "fx:id=\"Semestre1year1ModulePanel\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert Semestre1year2ModulePanel != null : "fx:id=\"Semestre1year2ModulePanel\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert Semestre2year1ModulePanel != null : "fx:id=\"Semestre2year1ModulePanel\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert Semestre2year2ModulePanel != null : "fx:id=\"Semestre2year2ModulePanel\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert SemestrePane != null : "fx:id=\"SemestrePane\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert SemestrePane2 != null : "fx:id=\"SemestrePane2\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert StacPane != null : "fx:id=\"StacPane\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert StatusCOLT != null : "fx:id=\"StatusCOLT\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert StatusLabel != null : "fx:id=\"StatusLabel\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert StudentIdCOLT != null : "fx:id=\"StudentIdCOLT\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert SysInfLabel != null : "fx:id=\"SysInfLabel\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert SystemEXP2lable != null : "fx:id=\"SystemEXP2lable\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TD3lable != null : "fx:id=\"TD3lable\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TDALgebre2TExtF != null : "fx:id=\"TDALgebre2TExtF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TDALgebre3TextFeild != null : "fx:id=\"TDALgebre3TextFeild\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TDALgo3TextF != null : "fx:id=\"TDALgo3TextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TDARCH1TEXTF != null : "fx:id=\"TDARCH1TEXTF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TDARCH2TF != null : "fx:id=\"TDARCH2TF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TDAlgebreTEXTF != null : "fx:id=\"TDAlgebreTEXTF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TDAlgo1TextF != null : "fx:id=\"TDAlgo1TextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TDAlgo2TextF != null : "fx:id=\"TDAlgo2TextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TDAnalyse1TExtF != null : "fx:id=\"TDAnalyse1TExtF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TDAnalyse2TextF != null : "fx:id=\"TDAnalyse2TextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TDAnalyse3TextFeild != null : "fx:id=\"TDAnalyse3TextFeild\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TDBDDTextF != null : "fx:id=\"TDBDDTextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TDGraphTextF != null : "fx:id=\"TDGraphTextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TDLable2 != null : "fx:id=\"TDLable2\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TDLable4 != null : "fx:id=\"TDLable4\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TDLangagueTextF1 != null : "fx:id=\"TDLangagueTextF1\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TDLogiqueTextF != null : "fx:id=\"TDLogiqueTextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TDNetworTextF != null : "fx:id=\"TDNetworTextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TDProba2TextF != null : "fx:id=\"TDProba2TextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TDProba3TF != null : "fx:id=\"TDProba3TF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TDSYSTEMEXPTEXTF != null : "fx:id=\"TDSYSTEMEXPTEXTF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TDSystemEXp2TextF != null : "fx:id=\"TDSystemEXp2TextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TDSystemINFTextF != null : "fx:id=\"TDSystemINFTextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert THYearsButton != null : "fx:id=\"THYearsButton\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TOpBarPAne != null : "fx:id=\"TOpBarPAne\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TPAlgo1TextF != null : "fx:id=\"TPAlgo1TextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TPAlgo2TextF != null : "fx:id=\"TPAlgo2TextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TPBeruTextF != null : "fx:id=\"TPBeruTextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TPFileTextFeild != null : "fx:id=\"TPFileTextFeild\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TPNetworkTextF != null : "fx:id=\"TPNetworkTextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TPOOP2TextF != null : "fx:id=\"TPOOP2TextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TPSYSTEMEXPTEXTF != null : "fx:id=\"TPSYSTEMEXPTEXTF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TPSystemEXp2TextF != null : "fx:id=\"TPSystemEXp2TextF\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TextFeildFirstName != null : "fx:id=\"TextFeildFirstName\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TextFeildLastName != null : "fx:id=\"TextFeildLastName\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TextFiealdSearch != null : "fx:id=\"TextFiealdSearch\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TextFiledStudentID != null : "fx:id=\"TextFiledStudentID\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert Tp3lable != null : "fx:id=\"Tp3lable\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TpLable2 != null : "fx:id=\"TpLable2\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert TpLable4 != null : "fx:id=\"TpLable4\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert YearCOLT != null : "fx:id=\"YearCOLT\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert YearComboBox != null : "fx:id=\"YearComboBox\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert langageLblle1 != null : "fx:id=\"langageLblle1\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert principalePane != null : "fx:id=\"principalePane\" was not injected: check your FXML file 'fxmlDocument.fxml'.";
                assert welcomLabel != null : "fx:id=\"welcomLabel\" was not injected: check your FXML file 'fxmlDocument.fxml'.";



        }


}

