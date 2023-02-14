package hackatone.test.demo.api;

import hackatone.test.demo.serviece.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    FileService fileService;

    @GetMapping
    public String getFile(@RequestParam String fileName) throws IOException {
        return fileService.getSerializedFile(fileName);
    }
}
