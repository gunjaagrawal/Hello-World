package hello

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.boot.SpringApplication

import org.springframework.boot.SpringApplication

object SampleController extends App {
        SpringApplication.run(classOf[SampleControllerConfig]);
}

@Controller
class SampleController {

	@RequestMapping(Array("/"))
	@ResponseBody
	def home = "Hello World!" 

}
