package ru.inno.course.homeworks.homework6.task1;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Copier {
    public static void copyTextFile(Path fileIn, Path fileOut) throws IOException {
        if (!Files.exists(fileIn)){
            throw new IOException("Нет такого файла: " + fileIn);
        }
        if (Files.exists(fileOut)){
            throw new IOException("Файл уже создан: " + fileOut);
        }
        List<String> fileInput = Files.readAllLines(fileIn);
        Files.copy(fileIn, fileOut);
    }
}
