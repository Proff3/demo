package hackatone.test.demo.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;

import static hackatone.test.demo.Config.PATH_TO_SAVE_FILE;

@RestController
@RequestMapping("/upload")
public class UploadController {

    @PostConstruct
    private void postConstruct() {
        File path = new File(PATH_TO_SAVE_FILE);
        if(!path.exists())
        {
            path.mkdir();
        }
    }

    @PostMapping("/excel")
    public String uploadExcel(@RequestParam("file") MultipartFile file) throws IOException {
        String orgName = file.getOriginalFilename();
        String filePath = PATH_TO_SAVE_FILE + orgName;
        File dest = new File(filePath);
        file.transferTo(dest);
        return "Th file is uploaded successfully " + System.getProperty("user.dir");
    }
}
