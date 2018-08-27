<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalCenterTitle">修改手机信息</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form>
                    <div class="form-group">
                        名称：<input type="text" class="form-control" id="name" placeholder="name" value="${mobile.id}">
                    </div>
                    <div class="form-group">
                        内存：<input type="text" class="form-control" id="storage" placeholder="storage">
                    </div>
                    <div class="form-group">
                        尺寸：<input type="text" class="form-control" id="in" placeholder="in">
                    </div>
                    <div class="form-group">
                        价格：<input type="text" class="form-control" id="money" placeholder="money">
                    </div>
                    <div class="form-group">
                        颜色：<input type="text" class="form-control" id="color" placeholder="color">
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>