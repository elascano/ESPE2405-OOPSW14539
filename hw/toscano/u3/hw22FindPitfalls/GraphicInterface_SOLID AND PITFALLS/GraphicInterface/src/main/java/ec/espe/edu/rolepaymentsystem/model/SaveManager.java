
    package ec.espe.edu.rolepaymentsystem.util;

    public class SaveManager {

        private DataSaver dataSaver;

        public SaveManager(DataSaver dataSaver) {
            this.dataSaver = dataSaver;
        }

        public void saveData(String data) {
            dataSaver.save(data);
        }
    }
    