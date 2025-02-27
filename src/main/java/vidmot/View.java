package vidmot;


public enum View {
    VELKOMINN("/hi/verkefni/vidmot/velkominn-view.fxml"),
    SPURNINGAR("/hi/verkefni/vidmot/spurningar-view.fxml"),
    KVEDJA("/hi/verkefni/vidmot/kvedja-view.fxml");


    private String fileName;

    View(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
