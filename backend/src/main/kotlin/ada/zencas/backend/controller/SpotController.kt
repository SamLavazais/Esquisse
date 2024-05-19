package ada.zencas.backend.controller

import ada.zencas.backend.data.model.SpotBasic
import ada.zencas.backend.data.model.SpotCreateRequest
import ada.zencas.backend.data.model.SpotDetail
import ada.zencas.backend.data.model.SpotUpdateRequest
import ada.zencas.backend.service.SpotService
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api")
class SpotController(private val spotService: SpotService) {

    @GetMapping("spots")
    fun getAllSpots(): ResponseEntity<List<SpotBasic>> = ResponseEntity(spotService.getAllSpots(), HttpStatus.OK)

    // TODO
    @GetMapping("task/{id}")
    fun getTaskById(@PathVariable id: Long): ResponseEntity<SpotDetail> =
        ResponseEntity(spotService.getSpotById(id), HttpStatus.OK)

    @PostMapping("create")
    fun createTask(
        @Valid @RequestBody createRequest: SpotCreateRequest
    ): ResponseEntity<SpotDetail> = ResponseEntity(spotService.createSpot(createRequest), HttpStatus.OK)

    @PatchMapping("update/{id}")
    fun updateTask(
        @PathVariable id: Long,
        @Valid @RequestBody updateRequest: SpotUpdateRequest
    ): ResponseEntity<SpotDetail> = ResponseEntity(spotService.updateSpot(id, updateRequest), HttpStatus.OK)

    @DeleteMapping("delete/{id}")
    fun deleteTask(@PathVariable id: Long): ResponseEntity<String> =
        ResponseEntity(spotService.deleteSpot(id), HttpStatus.OK)

}