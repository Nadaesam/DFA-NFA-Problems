package toc;

import toc.fsa_executor.FSAExecutor;
import toc.io.input.FileInputReader;
import toc.io.input.InputReader;
import toc.io.output.FileOutputWriter;
import toc.io.output.OutputWriter;

import java.io.*;

public class Main {
    private static final String inputFilePath = "src/main/resources/input.txt";
    private static final String outputFilePath = "src/main/resources/output.txt";

    public static void main(String[] args) {
        try {
            InputReader inputReader = new FileInputReader(new BufferedReader(new FileReader(inputFilePath)));
            OutputWriter outputWriter = new FileOutputWriter(new BufferedWriter(new FileWriter(outputFilePath)));

            String line;

            while ((line = inputReader.readLine()) != null) {
                if (line.isEmpty()) {
                    continue;
                }

                Integer fsaId = Integer.parseInt(line);

                outputWriter.writeLine(fsaId + "\n");

                FSAExecutor fsaExecutor = new FSAExecutorFactor(fsaId).getFSAExecutor();

                while (!(line = inputReader.readLine()).equalsIgnoreCase("end")) {
                    if (fsaExecutor == null) {
                        outputWriter.writeLine("null\n");
                        continue;
                    }

                    var isAccepted = fsaExecutor.execute(line);
                    outputWriter.writeLine((isAccepted ? "True" : "False") + "\n");
                }

                outputWriter.writeLine("x\n\n");
            }

            inputReader.cleanup();
            outputWriter.cleanup();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}