  $(document).bind('click', function(e) {
    $('.search-box').children().attr('disabled', 'disabled');
    $('.select-box').hide();
    $('.full-search .down').removeClass('on');
  });
  
  //下拉展开按钮
  function autoSelect(t) { 
    var e = window.event || arguments.callee.caller.arguments[0];
    e.stopPropagation();
    var t = $(t);
    var selectBox = t.siblings('.select-box');
    var searchBox = t.siblings('.search-box');
    if(selectBox.is(':visible')){
      searchBox.children().attr('disabled', 'disabled');
      selectBox.hide();
      t.removeClass('on');
    } else {
      selectBox.show();
      t.addClass('on');
    }
   }

   //选择产品框 点击
   function selectOpen(t) {
      var e = window.event || arguments.callee.caller.arguments[0];
      e.stopPropagation();
      var t = $(t);
      t.children().removeAttr('disabled');
      $('.select-box').hide();
      t.siblings('.select-box').show();
      t.addClass('on');
   }

   //多选
  $('.full-search .select-box p').click(function(e){
    var e = window.event || arguments.callee.caller.arguments[0];
    e.stopPropagation();
    var that = $(this);
    var items = $(this).parents('.select-box').find('p');
    var hasChoose = $(this).parents('.search-wrap').siblings('.has-choose');
    var spans = hasChoose.find('span');
    hasChoose.show();
    if(that.hasClass('checked')){
      that.removeClass('checked');
      spans.each(function() {
        if($(this).attr('data-id') == that.attr('data-id')){
          $(this).remove()
        }
      })
    } else {
      that.addClass('checked');
      hasChoose.find('.open-btn').before('<span data-id="'+ that.attr('data-id') +'">'+ that.text() +' <i>×</i></span>')
    }
    chooseFun(hasChoose);
  })

  //已选收起展开
  function chooseFun($obj){
    var allWidth = 0;
    var hasChoose = $obj;
    var children = hasChoose.find('.choose-box').find('span');
    var openBtn = hasChoose.find('.open-btn');
    var isopen = openBtn.hasClass('open');
    children.each(function(){
      $(this).show();
      allWidth += ($(this).width() + 32);
      if(isopen){
        if(allWidth  > 770){
          openBtn.show();
        } else {
          openBtn.hide();
        }
      } else {
        if(allWidth  > 770){
          $(this).hide();
          openBtn.show().text('点击展开 ↓');
        } else {
          openBtn.hide().text('点击收起 ↑');
        }
      }
    })
    if(children.length == 0){
      hasChoose.hide();
    }
  }

  //展开按钮点击
  function autoClick(t){
    var t = $(t);
    var items =  t.parent().find('span');
    if(t.hasClass('open')){
      t.removeClass('open').text('点击展开 ↓');
      chooseFun(t.parents('.has-choose'));
    } else {
      t.addClass('open').text('点击收起 ↑');
      items.show();
    }
  }

  //删除已选单项
  $('.has-choose .choose-box').on('click', 'i', function(){
    var p = $(this).parent();
    var hasChoose = p.parents('.has-choose');
    var id = p.attr('data-id');
    var plist = p.parents('.has-choose').siblings('.search-wrap').find('.select-box p');
    plist.each(function(){
      if($(this).attr('data-id') == id){
        $(this).removeClass('checked')
      }
    });
    p.remove();
    chooseFun(hasChoose);
  })

  //搜索
  function searchItems(t) { 
    var t = $(t);
    var value = t.attr('value');
    var items = t.parents('.search-box').siblings('.select-box').find('p');
    items.each(function(){
      $(this).show();
      if($(this).text().indexOf(value) < 0){
        $(this).hide();
      }
    })
   }

  //查询
  function chaxun(param) { 
    var openBtn = $('.has-choose .open-btn');
    openBtn.removeClass('open').text('点击展开 ↓');
    chooseFun($('.has-choose'));
   }