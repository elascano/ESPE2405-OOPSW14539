
    package ec.espe.edu.rolepaymentsystem.util;

    import java.io.FileWriter;
    import java.io.IOException;

    public class FileSaver implements DataSaver {
        
        private String fileName;

        public FileSaver(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void save(String data) {
            try (FileWriter writer = new FileWriter(fileName, true)) {
                writer.write(data + "\n");
            } catch (IOException e) {
                System.err.println("Error saving data to file: " + e.getMessage());
            }
        }
    }
    